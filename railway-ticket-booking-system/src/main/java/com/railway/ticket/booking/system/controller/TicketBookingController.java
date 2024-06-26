package com.railway.ticket.booking.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.ticket.booking.system.entity.BookingDetails;
import com.railway.ticket.booking.system.exception.CustomException;
import com.railway.ticket.booking.system.model.Ticket;
import com.railway.ticket.booking.system.projection.SeatAllocationProjection;
import com.railway.ticket.booking.system.service.BookingService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/ticket")
@Validated
public class TicketBookingController {
	@Autowired
	BookingService bs;
	
	@PostMapping("/create")
	public long bookTicket(@Valid @RequestBody Ticket t) throws Exception
	{
		if(t.getPd() == null)
		{
			throw new CustomException("Passanger Details Cannot be null");
		}
		System.out.println(t.toString());
		return bs.createBooking(t);
	}
	
	@GetMapping("/all")
	public List<BookingDetails> fetchAll()
	{
		return bs.fetchAll();
	}
	
	@GetMapping("/user/{email}")
	public BookingDetails fetchTicketByEmail(@PathVariable("email") String email)
	{
		return bs.fetchTicketByUser(email);
	}
	
	@GetMapping("/projection/all")
	public List<SeatAllocationProjection> fetchAllWithSeatAllocationProjection()
	{
		return bs.findAllWithSeatAllocationProjections();
	}

}
