package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolStrengthApplication implements CommandLineRunner {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(SchoolStrengthApplication.class);
       
        app.run(args);
	}
	
	 @Override
	    public void run(String... args) throws Exception {
		System.out.println("Invoke the methods");
	    }

}
