package com.calculator.calculator;

import com.calculator.calculator.calculator.CustomWebApplicationServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) throws IOException {
		new CustomWebApplicationServer(8080).start();

//		SpringApplication.run(CalculatorApplication.class, args);
	}

}
