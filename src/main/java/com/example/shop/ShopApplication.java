package com.example.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.MultipartConfigFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

@Configuration
@SpringBootApplication
@MapperScan("com.example.shop.mapper")
public class ShopApplication {


  public static void main(String[] args) {
    SpringApplication.run(ShopApplication.class, args);
  }
  @Bean
  public MultipartConfigElement multipartConfigElement() {
    MultipartConfigFactory factory = new MultipartConfigFactory();
    // 单个数据大小
    factory.setMaxFileSize(DataSize.parse("10MB")); // KB,MB
    // 总上传数据大小
    factory.setMaxRequestSize(DataSize.parse("10MB"));
    return factory.createMultipartConfig();
  }
  }
