package booking.server.controllers;

import booking.server.entities.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import booking.server.services.booking.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController 
{
	@Autowired
	private BookingService bookingService;

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Booking> getUsers()
	{
		return bookingService.getBookings();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveBooking(@RequestBody Booking booking) {
		bookingService.saveBooking(booking);
		return "/api/bookings/" + booking.getId();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Booking getBookingById(@PathVariable("id") long id) {
		return bookingService.getBookingById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteBookingById(@PathVariable("id") long id) {
		bookingService.deleteBookingById(id);
	}
	
}
