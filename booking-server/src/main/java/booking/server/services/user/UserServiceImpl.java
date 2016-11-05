package booking.server.services.user;

import org.springframework.beans.factory.annotation.Autowired;

import booking.server.entities.User;
import booking.server.repositories.UserRepository;

public class UserServiceImpl
	implements UserService{
	
	@Autowired
	private UserRepository userRepository; 
	
	public Iterable<User> getUsers()
	{
		return userRepository.findAll();
	}

	public User getUserById(long id) 
	{
		return userRepository.findOne(id);
	}

	public void deleteUserById(long id) 
	{
		userRepository.delete(id);
	}

	public void saveUser(User user) {
		userRepository.save(user);
	}
}
