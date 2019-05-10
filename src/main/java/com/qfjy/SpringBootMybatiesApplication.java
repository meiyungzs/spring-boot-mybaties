package com.qfjy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qfjy.mapper")
public class SpringBootMybatiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatiesApplication.class, args);
	}

}

