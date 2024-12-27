package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailModel {
	private String subject;
	private String message;
	public MailModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MailModel(String subject, String message) {
		super();
		this.subject = subject;
		this.message = message;
	}
	
	
	

}
