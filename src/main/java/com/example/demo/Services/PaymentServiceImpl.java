package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.BookingDto;
import com.example.demo.Dto.PaymentDto;
import com.example.demo.model.Booking;
import com.example.demo.model.Bus;
import com.example.demo.model.Payment;
import com.example.demo.Repository.BookingRepositoriy;
import com.example.demo.Repository.BusRepository;
import com.example.demo.Repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentRepository paymentRepository;
	

	
	@Override
	public Payment savePayment(Payment payment) {

		return paymentRepository.save(payment) ;
	}

	@Override
	public List<Payment> getPayment() {
		return paymentRepository.findAll();
	}

}