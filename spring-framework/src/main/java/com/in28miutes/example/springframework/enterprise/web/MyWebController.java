package com.in28miutes.example.springframework.enterprise.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28miutes.example.springframework.enterprise.business.BusinessService;

@Component
public class MyWebController {

  @Autowired	
  private BusinessService businessService;	
  
  public long returnValueFromBussinessService() {
	  
	 // return 200;
	  
	  return businessService.calculateSum();
  }
}
//in real world application we have different layer so we are creating---

