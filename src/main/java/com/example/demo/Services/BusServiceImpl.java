package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.BookingDto;
import com.example.demo.Dto.BusDto;
import com.example.demo.Repository.BookingRepositoriy;
import com.example.demo.Repository.BusRepository;
import com.example.demo.model.Booking;
import com.example.demo.model.Bus;
@Service
public class BusServiceImpl implements BusService{
	@Autowired
	private BusRepository busRepository;
	@Autowired
	private BookingRepositoriy bookingRepositoriy;

	@Override
	public Bus saveBusInfo(Bus bus) {
		// TODO Auto-generated method stub
		return busRepository.save(bus);
	}

	@Override
	public List<Bus> getBusInfo() {
		// TODO Auto-generated method stub
		return busRepository.findAll();
	}

	@Override
	public Bus getByBusNumber(String busNumber)  {
		// TODO Auto-generated method stub
		return busRepository.findBybusNumber(busNumber);
		
	}

	

	@Override
	public int getTotalAvailabilty(String busNumber, String bookingDate) {
		// TODO Auto-generated method stub
		Bus bus=getByBusNumber(busNumber);
		List<Booking> booking=bookingRepositoriy.findBybusAndBookingDate(bus, bookingDate);
		int totalBooking=booking.size();
		return bus.getSeatCapacity()-totalBooking;
	}

	@Override
	public List<Booking> getBookingsAndBusNumber(String busNumber) throws Exception {
		// TODO Auto-generated method stub
		try {
			Bus bus=getByBusNumber(busNumber);
			List<Booking> booking=bookingRepositoriy.findBybus_BusNumber(busNumber);
			return booking;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			throw new Exception("error occuer");
		}
		
	}





	





	
}
