package booking.server.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import booking.server.entity.User;

@Repository
public class UserDao 
{
	private static Map<Integer, User> users;
	
	static
	{
		users = new HashMap<>();
		users.put(1, new User(1, "Pawel", "Infa"));
		users.put(2, new User(2, "Karol", "Infa"));
		users.put(3, new User(3, "Adam", "Infa"));
	}
	
	public Collection<User> getUsers() 
	{
		return users.values();
	}

	public User getUserById(int id) 
	{
		return users.get(id);
	}

	public void deleteUserById(int id) 
	{
		users.remove(id);
	}
}
 