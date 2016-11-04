package booking.server.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import booking.server.dao.UserDao;
import booking.server.entity.User;
 
@Service
public class BookingService 
{
	@Autowired
	private UserDao userDao;
	
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

