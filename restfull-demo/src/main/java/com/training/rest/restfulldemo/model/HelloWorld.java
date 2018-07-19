package com.training.rest.restfulldemo.model;

public class HelloWorld {
	
	private String message;

	public HelloWorld(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	
	

}
