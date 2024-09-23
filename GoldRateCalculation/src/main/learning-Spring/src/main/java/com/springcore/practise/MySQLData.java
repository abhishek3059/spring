package com.springcore.practise;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;	
import org.springframework.stereotype.Component;
@Component @Qualifier("MySQLDataQualifier")
public class MySQLData implements DataService {

	
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		
		return new int [] {1,3,5,6,7,89,7,5,3,2,21,3};
	}

}
