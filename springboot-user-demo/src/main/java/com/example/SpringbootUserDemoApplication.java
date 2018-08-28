package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.example.mapper")
public class SpringbootUserDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootUserDemoApplication.class, args);
	}
}
