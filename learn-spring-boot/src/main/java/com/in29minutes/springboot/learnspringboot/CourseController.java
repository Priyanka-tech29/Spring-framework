package com.in29minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	//inside the controller we want to create a simple rest api or url and using that url we want to return some course details
	// for example - url = http://localhost:8080/courses and details like - id,name author name in json formate
	//in controller we want to bulid restAPI that's why we are going to use @RestController
	//we want to return list of courses so we are using method retriveAllCourses()
	//after creating course class and other requirement now we have to map url with specific method we can do it using @RequestMapping
	
	@RequestMapping("/courses")
    public List<Course> retriveAllCourses(){
    	
    	return Arrays.asList(
    			
    			new Course(1, "Learn AWS" , "in29minutes"),
    			new Course(2, "Learn Generative AI" , "in29minutes"),
    			new Course(3, "Learn Google Cloud" , "in29minutes")
    			);   
    			
    }
}
