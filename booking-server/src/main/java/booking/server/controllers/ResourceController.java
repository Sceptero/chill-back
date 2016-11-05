package booking.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import booking.server.services.booking.BookingService;

@RestController
@RequestMapping("/api/resource")
public class ResourceController {

	@Autowired
	private BookingService bookingService;
}
