package com.yangk.springbootmutildatasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yangk.springbootmutildatasource.mapper")
public class SpringbootMutilDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMutilDatasourceApplication.class, args);
	}

}
