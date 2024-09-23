package com.springcore.practise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class MondoDbData implements DataService{

	
	public int[] retrieveData() {
		
		return new int[] {1,2,43,5,6,7,8,9,034,342};
	}

}
