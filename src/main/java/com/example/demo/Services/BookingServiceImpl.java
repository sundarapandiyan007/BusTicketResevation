package com.example.demo.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.BookingDto;
import com.example.demo.Repository.BookingRepositoriy;
import com.example.demo.Repository.BusRepository;
import com.example.demo.model.Booking;
import com.example.demo.model.Bus;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	private BookingRepositoriy bookingRepositoriy;
	@Autowired
	private BusRepository busBusRepository;

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean saveBookingInfo(BookingDto bookings) {
		try {
			Bus bus = busBusRepository.findBybusNumber(bookings.getBusNumber());
			if (bus == null) {
				throw new Exception("Bus not found");
			}
			Booking booking=new Booking();
			booking.setBus(bus);
			booking.setNoOfTickets(bookings.getNoOfTickets());
			booking.setBookingDate(bookings.getBookingDate());
			booking.setBookingId(bookings.getBookingId());
			booking.setDeparture(bookings.getDeparture());
			booking.setDestination(bookings.getDestination());
			booking.setPassangerName(bookings.getPassangerName());
			booking.setPhoneNumber(bookings.getPhoneNumuber());
			
			booking.setBookingDate(bookings.getBookingDate());
			bookingRepositoriy.save(booking);
			for (int i = 1; i <= bookings.getNoOfTickets(); i++) {
			
				booking.setTotalPrice(bookings.getNoOfTickets() * bus.getPricePerTicket());
			
			}
			bookingRepositoriy.save(booking);
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}

	@Override
	public List<Booking> getBookings() {
		// TODO Auto-generated method stub

		return bookingRepositoriy.findAll();
	}

	@Override
	public void deleteByBookingId(int bookingId) {
		// TODO Auto-generated method stub
	    bookingRepositoriy.deleteBookingByBookingId(bookingId);
		
	}

	@Override
	public List<Booking> getByBookingId(int bookingId) {
		// TODO Auto-generated method stub
		return bookingRepositoriy.findByBookingId(bookingId);
	}

	

}
