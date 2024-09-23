package com.springcore.practise;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;

@Component
public class BussinessCalculationService {
 
	private DataService dataService;
   public BussinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

public int findMax() {
	   return Arrays.stream(dataService.retrieveData()).max().orElse(0);
   }
}
