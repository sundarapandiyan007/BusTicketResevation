package com.example.demo.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class KafkaMessageListioner {
	
	@KafkaListener(topics = "ticketbooking",groupId = "consumer-group" )
	public void consume(String message) {
		System.out.println("message recived:"+message);
	}

}
