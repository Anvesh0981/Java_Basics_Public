package com.example.Java_Basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(
        exclude = { DataSourceAutoConfiguration.class }
)
public class JavaBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBasicsApplication.class, args);
        IO.println("java");
	}

}
