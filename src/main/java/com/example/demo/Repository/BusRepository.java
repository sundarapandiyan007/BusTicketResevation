package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dto.BookingDto;
import com.example.demo.Dto.BusDto;
import com.example.demo.model.Booking;
import com.example.demo.model.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus,Long> {
	Bus findBybusNumber(String busNumber);
	
	


}
