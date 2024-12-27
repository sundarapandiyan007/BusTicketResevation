package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Dto.PaymentDto;
import com.example.demo.model.Payment;
import com.example.demo.Services.MailService;
import com.example.demo.Services.PaymentService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/pay")
public class PaymentController {
	@Autowired
	private PaymentService paymentService; 
	
	@Autowired
	private MailService mailService;
	
	@PostMapping("/save")
	public String savePaymentDetails(@RequestBody Payment payment) {
		Payment pay= paymentService.savePayment(payment);
		String a;
		if(pay!=null) {
			a = "Ticket Confirmed";
		}else {
			a = "Check your Payment Details";
		}
		return a;
		
	}
	
	@GetMapping("/getPayment")
	public List<Payment> getPayment() {
		return paymentService.getPayment();
	}
	
	
}
