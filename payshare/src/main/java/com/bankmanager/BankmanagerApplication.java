package com.bankmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.bankmanager")
public class BankmanagerApplication {


	public static void main(String[] args) {
		SpringApplication.run(BankmanagerApplication.class, args);
		
	}

}
