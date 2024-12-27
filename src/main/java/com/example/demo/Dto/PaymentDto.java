package com.example.demo.Dto;

import com.example.demo.model.Booking;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

public class PaymentDto {
	private long id;
	
	private long paymentId;
	
	private String accountNumber;
	
	private String accountHolderName;
	
	private Booking paymentDate;

	public PaymentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentDto(long id, long paymentId, String accountNumber, String accountHolderName, Booking paymentDate) {
		super();
		this.id = id;
		this.paymentId = paymentId;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.paymentDate = paymentDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Booking getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Booking paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
	
	
	

}
