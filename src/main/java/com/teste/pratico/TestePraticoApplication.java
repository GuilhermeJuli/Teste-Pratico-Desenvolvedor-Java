package com.teste.pratico;

import com.teste.pratico.db.BuildTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.teste.pratico"}) 
public class TestePraticoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestePraticoApplication.class, args);
		ConfigurableApplicationContext run = SpringApplication.run(BuildTable.class, args);
	}

}