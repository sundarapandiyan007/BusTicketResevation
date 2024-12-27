package com.example.demo.Repository;

import java.awt.print.Book;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dto.BookingDto;
import com.example.demo.model.Booking;
import com.example.demo.model.Bus;
@Repository
public interface BookingRepositoriy extends JpaRepository<Booking, Long> {
  List<Booking> findBybusAndBookingDate(Bus bus,String bookingDate);
  void deleteBookingByBookingId(int bookingId);
  Booking findBytotalPrice(Booking booking);
  List<Booking> findBybus_BusNumber(String busNumber);
  List<Booking> findByBookingId(int bookingId);
}
