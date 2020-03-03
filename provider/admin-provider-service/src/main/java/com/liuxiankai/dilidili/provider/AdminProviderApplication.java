package com.liuxiankai.dilidili.provider;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.liuxiankai.dilidili.provider.mapper")
public class AdminProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminProviderApplication.class,args);
    }
}
