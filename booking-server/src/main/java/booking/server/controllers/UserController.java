package booking.server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import booking.server.entities.User;
import booking.server.services.user.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<User> getUsers()
	{
		return userService.getUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String saveUser(@RequestBody User user)
	{
		userService.saveUser(user);
		return "ok";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getUserById(
			@PathVariable("id") long id)
	{ 
		return userService.getUserById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteUserById(
			@PathVariable("id") long id)
	{
		userService.deleteUserById(id);
	}
}
