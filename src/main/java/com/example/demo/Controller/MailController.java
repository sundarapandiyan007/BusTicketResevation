package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.MailService;
import com.example.demo.model.MailModel;

@RestController
@RequestMapping("/mail")
public class MailController {
	@Autowired
	private MailService mailService;
	
	@PostMapping("/sender/{mail}")
	public String sendMail(@PathVariable String mail,
			@RequestBody MailModel mailStrecture) {
		 mailService.sendMail(mail, mailStrecture);
		 return "sucussfull send";
		
	}

}
