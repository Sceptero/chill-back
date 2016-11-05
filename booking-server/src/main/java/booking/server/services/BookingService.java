package booking.server.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import booking.server.entities.User;
import booking.server.repositories.UserRepository;
 
@Service
public class BookingService 
{
	@Autowired
	private UserRepository userDao;
	
	public Collection<User> getUsers()
	{
		return userDao.getUsers();
	}

	public User getUserById(int id) 
	{
		return userDao.getUserById(id);
	}

	public void deleteUserById(int id) 
	{
		userDao.deleteUserById(id);
	}
}

