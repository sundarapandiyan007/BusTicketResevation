package com.example.demo.Dto;

import lombok.Getter;
import lombok.Setter;

public class BookingDto {
	private String busNumber;
	private String [] passangerName;
	private String phoneNumuber;
	private String departure;
	private String destination;
	private int noOfTickets;
	private int bookingId;
	private String bookingDate;
	private double totalPrice;
	public BookingDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingDto(String busNumber, String[] passangerName, String phoneNumuber, String departure,
			String destination, int noOfTickets, int bookingId, String bookingDate, double totalPrice) {
		super();
		this.busNumber = busNumber;
		this.passangerName = passangerName;
		this.phoneNumuber = phoneNumuber;
		this.departure = departure;
		this.destination = destination;
		this.noOfTickets = noOfTickets;
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.totalPrice = totalPrice;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String[] getPassangerName() {
		return passangerName;
	}
	public void setPassangerName(String[] passangerName) {
		this.passangerName = passangerName;
	}
	public String getPhoneNumuber() {
		return phoneNumuber;
	}
	public void setPhoneNumuber(String phoneNumuber) {
		this.phoneNumuber = phoneNumuber;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
	
}
