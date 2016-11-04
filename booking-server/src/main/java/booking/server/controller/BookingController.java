package booking.server.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import booking.server.entity.User;
import booking.server.service.BookingService;

@RestController
@RequestMapping("/api/users")
public class BookingController 
{
	@Autowired
	private BookingService bookingService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<User> getUsers()
	{
		return bookingService.getUsers();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getUserById(
			@PathVariable("id") int id)
	{ 
		return bookingService.getUserById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteUserById(
			@PathVariable("id") int id)
	{
		bookingService.deleteUserById(id);
	}
}
