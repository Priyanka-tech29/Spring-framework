package com.in28miutes.example.springframework.enterprise.dataservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public  class DataService {
	
	public List<Integer> getdata(){
		return Arrays.asList(10,20,30,70);
	}
	
}