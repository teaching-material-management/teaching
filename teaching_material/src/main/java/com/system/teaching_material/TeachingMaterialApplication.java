package com.system.teaching_material;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = ("com.system.teaching_material.mapper"))
public class TeachingMaterialApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeachingMaterialApplication.class, args);
    }

}
