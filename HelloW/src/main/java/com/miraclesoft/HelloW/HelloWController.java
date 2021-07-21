package com.miraclesoft.HelloW;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/rest")
public class HelloWController {
	
	@RequestMapping("/hello")
	public String helloWorld()
	{
		return "hello world";
	}
	
	

}
