/**
 * Created by ThinkPad on 2016/7/20.
 */
define(['jquery', 'common/horizontalScrollTable', 'company/parser', 'data/finstatement'], function ($, horizontalScrollTable, parser, finstatement) {
    var unit = {
        万: 10000,
        百万: 1000000,
        亿: 100000000,
    }
    var table = ['income', 'balance', 'cash', 'finindex'];
    var year = [];
    var tableColumn = {};

    var customColumnFormula = {
        营业收入: ['营业收入', '亿'],
        营业收入增长率: ['主营业务收入增长率', '%'],
        毛利率: ['销售毛利率', '%'],
        三项费用率: ['(管理费用+销售费用+财务费用)/营业收入', '%'],
        销售费用率: ['销售费用/营业收入', '%'],
        管理费用率: ['管理费用/营业收入', '%'],
        财务费用率: ['财务费用/营业收入', '%'],
        净利润: ['净利润', '亿'],
        净利润率: ['净利润/营业收入', '%'],
        净利润增长率: ['净利润增长率', '%'],
        资产负债率: ['负债总额/资产总额', '%'],
        流动比率: ['流动资产合计/流动负债合计', ''],
        速动比率: ['(流动资产合计-存货)/流动负债合计', ''],
        存货周转率: ['营业成本*2/(存货+上一年存货)', ''],
        应收账款周转率: ['营业收入*2/(应收账款 + 上一年应收账款)', ''],
        固定资产比重: ['固定资产净额/资产总额', '%'],
        净资产收益率ROE: ['净资产收益率', '%'],
        总资产收益率: ['净利润/资产总额', '%'],
        经营性现金流净额比净利润: ['经营活动产生的现金流量净额/净利润', '']
    };

    var industryCompanyColumnName = {
        name: ['名称', ''],
        symbol: ['代码', ''],
        current: ['现价', ''],
        pb: ['pb', ''],
        pettm: ['pe', ''],
        marketcapital: ['市值', '亿'],
        mainbusiincome: ['营业收入', '亿'],
        netprofit: ['净利率', '亿'],
        basiceps: ['基本每股收益', ''],
        naps: ['每股净资产', ''],
        opercashpershare: ['每股现金流', '']
    }

    var formulas = {};
    var customData = {};
    var finStats = [];
    (function () {
        $.each(customColumnFormula, function (columnName) {
            formulas[columnName] = parser.formulaParse(customColumnFormula[columnName][0]);
        });

        $.each(formulas, function (columnName) {
            $.each(this, function (i) {
                if (this.match(/[a-z\u4e00-\u9eff]{1,20}/)) {
                    customData[this] = [];
                }
            })
        });

        $.each(table, function (i, tableName) {
            tableColumn[tableName] = [];
        });

        $.each(customData, function (columName) {
            if (columName.indexOf('上一年') == -1) {
                $.each(table, function (i, tableName) {
                    var index = finstatement.getColumn(tableName)[0].indexOf(columName)
                    if (index != -1) {
                        tableColumn[tableName].push(finstatement.getColumn(tableName)[1][index]);
                        return false;
                    }
                });
            }
        });

        $.each(tableColumn, function (tableName) {
            finStats.push({table: tableName, columns: tableColumn[tableName]});
        });
    })();

    function calcuate(operator, operand1, operand2) {
        var value = 0;
        switch (operator) {
            case '+':
                value = operand1 + operand2;
                break;
            case '-':
                value = operand1 - operand2;
                break;
            case '*':
                value = operand1 * operand2;
                break;
            case '/':
                value = operand1 / operand2;
                break;
        }

        return value;
    }

    function initIndustryCompanyIndex(panel, codes) {
        $.ajax({
            url: "http://localhost:8080/getIndustryCompanyIndex?code=" + codes.join(','),
            type: 'GET',
            success: function (data, status, xhr) {
                var table = $('<table id="table" class="table table-bordered table-striped table-condensed">');
                horizontalScrollTable.appendTo(panel, table);
                var row = $('<tr>');
                $.each(industryCompanyColumnName, function (index, columnName) {
                    var dataUnit = columnName[1];
                    var td = $('<td>').html(unit[dataUnit] == undefined ? columnName[0] : columnName[0] + '(' + dataUnit + ')');
                    row.append(td);
                    table.append(row);

                });

                $.each(data, function (i, item) {
                    row = $('<tr>');
                    $.each(industryCompanyColumnName, function (index, columnName) {
                        var dataUnit = columnName[1];
                        if (typeof item[index] == "string") {
                            var td = $('<td>').html(item[index]);
                        } else {
                            var cellData = 0;
                            if (dataUnit == '%') {
                                cellData = (item[index] * 100).toFixed(2);
                            } else if (dataUnit != '' && unit[dataUnit] != undefined) {
                                cellData = (item[index] / unit[dataUnit]).toFixed(2);
                            } else {
                                cellData = item[index].toFixed(2);
                            }

                            var td = $('<td>').html(dataUnit == '%' ? cellData + "%" : cellData);
                        }

                        row.append(td);
                    });
                    table.append(row);
                });

                horizontalScrollTable.init(table);
            },
            error: function (xhr, error, exception) {

            }
        });
    }

    function render(panel, codes, checkedCompaniesName) {
        panel.empty();

        initIndustryCompanyIndex(panel, codes);

        $.ajax({
            url: "http://localhost:8080/getSpecificFinStatement",
            type: 'POST',
            data: JSON.stringify({codes: codes, finStats: finStats}),
            dataType: "json",
            contentType: 'application/json;charset=utf-8',
            success: function (data, status, xhr) {
                //var table = $('<table id="table" class="table table-bordered table-striped table-condensed">');
                //horizontalScrollTable.appendTo(panel, table);

                var columnDatas = {};
                $.each(codes, function (i, code) {
                    columnDatas[code] = $.extend(true, {}, customData);
                });
                $.each(data, function (i, item) {
                    var columns = finstatement.getColumn(item['table']);
                    $.each(item['columns'], function (i, columnName) {
                        var cumstomDataName = columns[0][columns[1].indexOf(columnName)];
                        $.each(item['data'], function(i, data){
                            var code = data.stockcode;
                            if(data.enddate != undefined && year.indexOf(data.enddate) == -1) {
                                year.push(data.enddate);
                            } else if(data.reportdate != undefined && year.indexOf(data.reportdate) == -1) {
                                year.push(data.reportdate);
                                
                            }
                            columnDatas[code][cumstomDataName].unshift([data[columnName], data.enddate != undefined ? data.enddate : data.reportdate]);
                        })
                    });
                });

                year.sort();
                year.reverse();

                console.log(year);
                $.each(customColumnFormula, function (columnName) {
                    var dataUnit = customColumnFormula[columnName][1];
                    var itemName = unit[dataUnit] == undefined ? columnName : columnName + '(' + dataUnit + ')';
                    panel.append(itemName);
                    if (this[0].match(/[\+\-\*\/\(\)]/) != null) {
                        var stack = [];
                        var temp = {};
                        $.each(codes, function (i, code) {
                            temp[code] = [];
                        });
                        var formula = formulas[columnName].slice();
                        while (formula.length > 0) {
                            if (formula[0].match(/[\+\-\*\/]/)) {
                                var operator = formula.shift();

                                var operand1 = stack.shift();
                                var operand2 = stack.shift();
                                var left = {},
                                    right = {};
                                $.each(columnDatas, function (code, columnData) {
                                    left[code] = [];
                                    right[code] = [];

                                    if (operand2 == 'temp') {
                                        left[code] = temp[code];
                                    } else if (operand2.match(/^[\-\+]?\d+(\.\d+)?/)) {
                                        left[code] = operand2;
                                    } else {
                                        left[code] = columnData[operand2];
                                    }

                                    if (operand1 == 'temp') {
                                        right[code] = temp[code];
                                    } else if (operand1.match(/^[\-\+]?\d+(\.\d+)?/)) {
                                        right[code] = operand1;
                                    } else {
                                        right[code] = columnData[operand1];
                                    }

                                    if (left[code] == undefined || right[code] == undefined) {
                                        return true;
                                    }

                                    var len = 0;
                                    if (left[code] instanceof Array && right[code] instanceof Array) {
                                        len = Math.min(left[code].length, right[code].length);
                                        var m = 0;
                                        var n = 0;
                                        for (var i = 0; i < len; i++) {
                                            if (left[code][m][1] == right[code][n][1]) {
                                                if(left[code][m] != '-' && right[code][n][0] != '-') {
                                                    temp[code][i] = [calcuate(operator, left[code][m][0], right[code][n][0]), left[code][m][1]];
                                                    
                                                } else {
                                                    temp[code][i] = ['-', left[code][m][1]];
                                                }
                                                
                                                m++;
                                                n++;
                                            } else if(left[code][m][1] > right[code][n][1]){
                                                temp[code][i] = ['-', left[code][m][1]];
                                                m++;
                                            } else if(left[code][m][1] < right[code][n][1]) {
                                                temp[code][i] = ['-', left[code][n][1]];
                                                n++;
                                            }
                                        }
                                    } else if (left instanceof Array) {
                                        len = left.length;

                                        for (var i = 0; i < len; i++) {
                                            if(left[code][i][0] != '-') {
                                                temp[code][i] = [calcuate(operator, left[code][i][0], right[code]), left[code][i][1]];
                                            }
                                        }
                                    } else if (right instanceof Array) {
                                        len = right[code].length;

                                        for (var i = 0; i < len; i++) {
                                            temp[code][i] = [calcuate(operator, left[code], right[code][i][0]), right[code][i][1]];
                                        }
                                    }

                                    stack.unshift('temp');
                                });
                            } else {
                                stack.unshift(formula.shift());
                            }
                        }
                        var table = $('<table id="table" class="table table-bordered table-striped table-condensed">');
                        horizontalScrollTable.appendTo(panel, table);
                        var row = $('<tr>');
                        row.append($('<td>').html('公司\\年份'));
                        for (var i = 0; i< 10; i++) {
                            if(year.length > i) {
                                row.append($('<td>').html(year[i]));
                            }

                        }
                        table.append(row);
                        $.each(temp, function (code, data) {
                            var tRow = $('<tr>');
                            tRow.append($('<td>').html(checkedCompaniesName[codes.indexOf(code)]));
                            var index = 0;
                            for(var i = 0; i< 10; i++) {
                                if(data.length == 0 || data.length <= index || year[i] > data[index] || data[index][0] == '-') {
                                    tRow.append($('<td>').html("-"));
                                    continue;
                                }

                                var cellData = 0;
                                if (dataUnit == '%') {
                                    cellData = (data[index][0] * 100).toFixed(2);
                                } else if (dataUnit != '' && unit[dataUnit] != undefined) {
                                    cellData = (data[index][0] / unit[dataUnit]).toFixed(2);
                                } else {
                                    cellData = data[index][0].toFixed(2);
                                }

                                tRow.append($('<td>').html(dataUnit == '%' ? cellData + "%" : cellData));
                                index ++;
                            }
//                            $.each(data, function (i) {
                                
                                //chart.addColumnData(columnName, parseFloat(cellData));
//                            });

                            table.append(tRow);
                        });
                        horizontalScrollTable.init(table);
                    } else {
                        var table = $('<table id="table" class="table table-bordered table-striped table-condensed">');
                        horizontalScrollTable.appendTo(panel, table);
                        var row = $('<tr>');
                        row.append($('<td>').html('公司\\年份'));
                        for (var i = 0; i< 10; i++) {
                            if(year.length > i) {
                                row.append($('<td>').html(year[i]));
                            }

                        }
                        table.append(row);
                        var columnName = customColumnFormula[columnName][0];
                        $.each(columnDatas, function (code, data) {
                            var tRow = $('<tr>');
                            tRow.append($('<td>').html(checkedCompaniesName[codes.indexOf(code)]));
                            var index = 0;
                            console.log(data[columnName]);
                            for(var i = 0; i< 10; i++) {
                                if(data[columnName].length == 0 || data[columnName].length <= index || year[i] > data[columnName][index][1]) {
                                    tRow.append($('<td>').html("-"));
                                    continue;
                                }

                                var cellData = 0;

                                if (dataUnit == '%') {
                                    cellData = parseFloat(data[columnName][index][0]).toFixed(2);
                                } else if (dataUnit != '' && unit[dataUnit] != undefined) {
                                    cellData = (parseFloat(data[columnName][index][0]) / unit[dataUnit]).toFixed(2);
                                } else {
                                    cellData = parseFloat(data[columnName][index][0]).toFixed(2);
                                }
                                
                                tRow.append($('<td>').html(dataUnit == '%' ? cellData + "%" : cellData));
                                index ++;
                            }

                            table.append(tRow);
                        });

                        horizontalScrollTable.init(table);
                    }
                });

            },
            error: function (xhr, error, exception) {

            }
        });

    }

    return {
        render: render
    }
});
