package com.example.demo.Dto;

import jakarta.persistence.Column;

public class BusDto {
	private long id;
	private String busNumber;
	private String busType;
	private int seatCapacity;
	private double pricePerTicket;
	private int totalSeatAvilabilty;
	private String depatureTime;
	private String arrivelTime;
	public BusDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BusDto(long id, String busNumber, String busType, int seatCapacity, double pricePerTicket,
			int totalSeatAvilabilty, String depatureTime, String arrivelTime) {
		super();
		this.id = id;
		this.busNumber = busNumber;
		this.busType = busType;
		this.seatCapacity = seatCapacity;
		this.pricePerTicket = pricePerTicket;
		this.totalSeatAvilabilty = totalSeatAvilabilty;
		this.depatureTime = depatureTime;
		this.arrivelTime = arrivelTime;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public double getPricePerTicket() {
		return pricePerTicket;
	}
	public void setPricePerTicket(double pricePerTicket) {
		this.pricePerTicket = pricePerTicket;
	}
	public int getTotalSeatAvilabilty() {
		return totalSeatAvilabilty;
	}
	public void setTotalSeatAvilabilty(int totalSeatAvilabilty) {
		this.totalSeatAvilabilty = totalSeatAvilabilty;
	}
	public String getDepatureTime() {
		return depatureTime;
	}
	public void setDepatureTime(String depatureTime) {
		this.depatureTime = depatureTime;
	}
	public String getArrivelTime() {
		return arrivelTime;
	}
	public void setArrivelTime(String arrivelTime) {
		this.arrivelTime = arrivelTime;
	}
	
	

}
