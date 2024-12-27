package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Booking;
import com.fasterxml.jackson.core.JsonProcessingException;


@RestController
@RequestMapping("/message")
public class KafkaController {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	@PostMapping("/send")
	public String publish(@RequestParam("message") String msg ) {
	
		kafkaTemplate.send("ticketbooking", msg);
		return "message published :"+msg;
	}

}
