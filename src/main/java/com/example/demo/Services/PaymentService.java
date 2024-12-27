package com.example.demo.Services;

import java.util.List;

import com.example.demo.Dto.PaymentDto;
import com.example.demo.model.Payment;

public interface PaymentService {
	public Payment savePayment(Payment payment);
	public List<Payment> getPayment();
}
