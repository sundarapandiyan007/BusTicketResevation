package com.example.demo.Services;

import java.util.List;

import com.example.demo.model.Booking;
import com.example.demo.model.Bus;

public interface BusService {
	public Bus saveBusInfo(Bus bus);
	public List<Bus> getBusInfo();
	int getTotalAvailabilty(String busNumber,String bookingDate);
	Bus getByBusNumber(String busNumber);
	List<Booking> getBookingsAndBusNumber(String busNumber) throws Exception; 
	
	


}
