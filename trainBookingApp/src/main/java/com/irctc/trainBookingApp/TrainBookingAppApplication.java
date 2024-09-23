package com.irctc.trainBookingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.irctc.trainBookingApp.controller.BookingController;

@SpringBootApplication
public class TrainBookingAppApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(TrainBookingAppApplication.class, args);
		context.getBean(BookingController.class);
	}

}
