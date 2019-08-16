package com.liushuai.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages={"com.liushuai.example.demo"})
public class SpringbootMybatisThymeleafDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisThymeleafDemoApplication.class, args);
	}

}
