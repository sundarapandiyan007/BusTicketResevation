package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
@Entity
@Table(name="bus",uniqueConstraints = @UniqueConstraint(columnNames = {"busNumber"}))
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="busNumber",nullable = false)
	private String busNumber;
	@Column(name="busType",nullable = false)
	private String busType;
	@Column(name="seatCapacity",nullable = false)
	private int seatCapacity;
	@Column(name="depatureTime",nullable=false)
	private String depatureTime;
	@Column(name="arrivelTime" ,nullable=false)
	private String arrivelTime;
	@Column(name="pricePerTicket",nullable = false)
	private double pricePerTicket;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(long id, String busNumber, String busType, int seatCapacity, String depatureTime, String arrivelTime,
			double pricePerTicket) {
		super();
		this.id = id;
		this.busNumber = busNumber;
		this.busType = busType;
		this.seatCapacity = seatCapacity;
		this.depatureTime = depatureTime;
		this.arrivelTime = arrivelTime;
		this.pricePerTicket = pricePerTicket;
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
	public double getPricePerTicket() {
		return pricePerTicket;
	}
	public void setPricePerTicket(double pricePerTicket) {
		this.pricePerTicket = pricePerTicket;
	}
	
	

	

}
