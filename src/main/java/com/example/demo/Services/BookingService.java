package com.example.demo.Services;

import java.awt.print.Book;
import java.util.List;

import com.example.demo.Dto.BookingDto;
import com.example.demo.model.Booking;

public interface BookingService {
	public boolean saveBookingInfo(BookingDto   bookings);
	public List<Booking> getBookings();
	void deleteByBookingId(int bookingId);
	List<Booking> getByBookingId(int bookingId);

	
}
