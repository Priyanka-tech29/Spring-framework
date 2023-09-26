package com.in28miutes.example.springframework.enterprise.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28miutes.example.springframework.enterprise.dataservice.DataService;

@Component
 public class BusinessService {
	
	@Autowired
	private DataService dataService;
	
	public long calculateSum() {
		
		List<Integer> data = dataService.getdata();
		return data.stream().reduce(Integer:: sum).get();// here we are using functional program to get sum of values
	}
	
}


