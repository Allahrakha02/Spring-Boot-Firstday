package com.training.rest.restfulldemo.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.rest.restfulldemo.model.HelloWorld;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping(path = "/testCall")
	public String testCall() {

		List<String> aList = aList = Arrays.asList("all", "emo", "rao", "equa", "sonal", "mritas", "janyabi", "sonia","karuti", "leela", "arjeen");
		// System.out.println(aList);
		return "The List is : " + aList + " ";
	}

	@GetMapping(path="hello-world-bean")
	public HelloWorld helloworld() {
		
		return new HelloWorld("Hello Exilite!!!!");
	}
	
	@GetMapping(path="hello-world/path-variable/{name}")
	public HelloWorld helloworldPathVriable(@PathVariable String name) {
		
		return new HelloWorld(" Hello World!!!! Mr/Mrs/Ms " .toUpperCase()+name.toUpperCase()+" ".toLowerCase());
	}

}
