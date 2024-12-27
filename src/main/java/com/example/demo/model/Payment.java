package com.example.demo.model;

import java.util.Random;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="paymentId", nullable = false)
	private long paymentId;
	@Column(name="accountNumber",nullable = false,unique = true)
	private String accountNumber;
	@Column(name="accountHolderName",nullable = false)
	private String accountHolderName; 
	@Column(name="paymentDate",nullable = false)
	private String paymentDate;
	
	@PrePersist
	protected void onCreate() {
		this.paymentId= generateFourDigitNumber();
	}
	private int generateFourDigitNumber() {
		Random random=new Random();
		return 1000+random.nextInt(9000);
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(long id, long paymentId, String accountNumber, String accountHolderName, String paymentDate) {
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
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
	
	
	
	

}
