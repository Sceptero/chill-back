package booking.server.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import booking.server.entities.User;
import enums.UserLevel;

@Repository
public class UserRepository 
{
	private static Map<Integer, User> users;
	
	static
	{
		users = new HashMap<>();
		users.put(1, new User(1, "pustypawel", "mojakupa", UserLevel.ADMIN));
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
 