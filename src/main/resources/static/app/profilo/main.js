/**
 * Created by ThinkPad on 2016/7/22.
 */
define(['jquery', 'domReady', 'common/horizontalScrollTable'], function ($, domready, horizontalScrollTable) {
    domready(function (){
        $.ajax({
                url: 'http://localhost:8080/getMinMartetCapitial',
                type: 'GET',
                success: function (data, status, xhr) {
                    var container = $('#portflioContainer');
                    container.append('最小市值');
                    var table = $('<table id="table" class="table table-bordered table-striped table-condensed">');
                    horizontalScrollTable.appendTo(container, table);
                    var row = $('<tr>');
                    row.append($('<td>').html('股票名称'));
                    row.append($('<td>').html('股票代码'));
                    row.append($('<td>').html('市值(亿)'));
                    table.append(row);
                    $.each(data, function (i, item) {
                        var row = $('<tr>');

                        row.append($('<td>').html(item.name));
                        row.append($('<td>').html(item.symbol));
                        row.append($('<td>').html((item.marketcapital /100000000).toFixed(2)));

                        table.append(row);
                    });
                },
                error: function (xhr, error, exception) {

                }
            }
           );

        $.ajax({
                url: 'http://localhost:8080/getMinPb',
                type: 'GET',
                success: function (data, status, xhr) {
                    var container = $('#portflioContainer');
                    container.append('最小市净率');
                    var table = $('<table id="table" class="table table-bordered table-striped table-condensed">');
                    horizontalScrollTable.appendTo(container, table);
                    var row = $('<tr>');
                    row.append($('<td>').html('股票名称'));
                    row.append($('<td>').html('股票代码'));
                    row.append($('<td>').html('pb'));
                    table.append(row);
                    $.each(data, function (i, item) {
                        var row = $('<tr>');

                        row.append($('<td>').html(item.name));
                        row.append($('<td>').html(item.symbol));
                        row.append($('<td>').html((item.pb).toFixed(2)));

                        table.append(row);
                    });
                },
                error: function (xhr, error, exception) {

                }
            }
        );
    });
});
