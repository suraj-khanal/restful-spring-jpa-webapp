package com.suraj.rest.restfulwebservice.helloworld;

public class HelloWorldBean {

	private String message;
	private int id;

	public HelloWorldBean(String message, int id) {
		
		this.message = message;
		this.id = id;
	}

	public String getMessage() {
		return message;
	}
	public int getId() {
		return id;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + " + id=" + id+ "]";
	}
	
	

}
