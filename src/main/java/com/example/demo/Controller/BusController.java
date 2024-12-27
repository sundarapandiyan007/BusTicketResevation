package com.example.demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.BookingDto;
import com.example.demo.Dto.BusDto;
import com.example.demo.Services.BusService;
import com.example.demo.model.Booking;
import com.example.demo.model.Bus;

@RestController
@RequestMapping("/bus")
public class BusController {
	@Autowired
	private BusService busService;
	
	@PostMapping("/save") 
	public Map<String, Object> saveBusInfo(@RequestBody Bus bus){
		Bus buses=busService.saveBusInfo(bus);
		Map<String, Object> response=new HashMap<>();
		if(buses!=null) {
		response.put("massage", "sucusses");
		response.put("Status",HttpStatus.OK);
		}else {
			response.put("massage", "sucusses");
			response.put("Status",HttpStatus.BAD_REQUEST);
		}
		
		return response;
	}
	
	@GetMapping("/get")
	public List<Bus> getBusInfo() {
		return  busService.getBusInfo();
	}
	
	@GetMapping("/get/seatAvailabilty")
	public int seatAvailabilty(@RequestParam("busNumber") String busNumber,@RequestParam("bookingDate") String bookingDate) {
		return busService.getTotalAvailabilty(busNumber, bookingDate);
	}
	
	@GetMapping("/get/bookingsByBusNumber")
	public List<Booking> getBookings(@RequestParam("busNumber") String busNumber) throws Exception{
		return busService.getBookingsAndBusNumber(busNumber);
	}

}
