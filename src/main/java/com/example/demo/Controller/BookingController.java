package com.example.demo.Controller;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.BookingDto;
import com.example.demo.Services.BookingService;
import com.example.demo.Services.BookingServiceImpl;
import com.example.demo.Services.BusServiceImpl;
import com.example.demo.model.Booking;
import com.example.demo.model.Bus;

@RestController
@RequestMapping("/Booking")
public class BookingController {
	@Autowired
	private BookingService bookingService;

	@PostMapping("/ticket/book")
	public Map<String, Object> bookingTicket(@RequestBody BookingDto bookings) {
		Map<String, Object> response = new HashMap<>();
		boolean booking = bookingService.saveBookingInfo(bookings);
		if (booking) {
			response.put("message", "Pay Now");
			response.put("status", HttpStatus.OK);
		} else {
			response.put("message", "Tickets not available");
			response.put("status", HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
		}
		response.put("timestamp", new Date());

		return response;

	}

	@GetMapping("/get/bookings")
	public List<Booking> getBookings() {
		return bookingService.getBookings();
	}
	
	@DeleteMapping("/cancel/bookings")
	public Map<String,Object> CancelBookings(@RequestParam("bookingId")int bookingId){
		Map<String,Object> response=new HashMap<>();
		try {
		 bookingService.deleteByBookingId(bookingId);
		 response.put("message", "booking Cancel");
		 
			
		} catch (Exception e) {
			// TODO: handle exception
			response.put("message", "BookingId Not Found");
		}
		return response;
	}
	
	

}
