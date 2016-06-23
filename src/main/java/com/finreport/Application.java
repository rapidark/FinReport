package com.finreport;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
@ComponentScan( basePackages = {"hello"} )
@ImportResource("classpath:applicationContext-mybatis.xml")
@EnableScheduling
public class Application {

    @Bean
    public Filter characterEncodingFilter() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return characterEncodingFilter;
    }

    @Bean
    public HttpMessageConverters restFileDownloadSupport() {
        ByteArrayHttpMessageConverter arrayHttpMessageConverter = new ByteArrayHttpMessageConverter();
        return new HttpMessageConverters(arrayHttpMessageConverter);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
