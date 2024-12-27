package com.example.demo.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="phoneNumber", nullable = false)
	private String phoneNumber;
	@Column(name="departure", nullable = false)
	private String departure;
	@Column(name="destination", nullable = false)
	private String destination;
	@Column(name="noOfTickets", nullable = false)
	private int noOfTickets;
	@Column(name="passangerName", nullable = false)
	private String[] passangerName = new String[noOfTickets];
	@Column(name="bookingId", nullable = false)
	private int bookingId;
	@Column(name="bookingDate", nullable = false)
	private String bookingDate;
	@Column(name="totalPrice", nullable = false)
	private double totalPrice;
	

	@ManyToOne(targetEntity =Bus.class)
	@JoinColumn(name="Bus",referencedColumnName = "busNumber")
	private Bus bus;
	
	@PrePersist
	protected void onCreate() {
		this.bookingId= generateFourDigitNumber();
	}
	private int generateFourDigitNumber() {
		Random random=new Random();
		return 1000+random.nextInt(9000);
	}
		
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(long id, String phoneNumber, String departure, String destination, int noOfTickets,
			String[] passangerName, int bookingId, String bookingDate, Bus bus) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.departure = departure;
		this.destination = destination;
		this.noOfTickets = noOfTickets;
		this.passangerName = passangerName;
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.bus = bus;
	}
	
	

	

	
	

		
}
