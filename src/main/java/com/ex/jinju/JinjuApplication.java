package com.ex.jinju;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.ex.jinju.mapper"})
@SpringBootApplication
public class JinjuApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(JinjuApplication.class, args);
	}

}
