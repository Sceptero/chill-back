package booking.server.services.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import booking.server.entities.User;
import booking.server.enums.UserLevel;
import booking.server.repositories.UserRepository;

@Service
public class UserServiceImpl
	implements UserService{
	
	@Autowired
	private UserRepository userRepository; 
	
	@Override
	public Iterable<User> getUsers()
	{
		return userRepository.findAll();
	}

	@Override
	public User getUserById(long id) 
	{
		return userRepository.findOne(id);
	}
	
	@Override
	public List<User> getUserByLevel(UserLevel userLevel) {
		return userRepository.findByUserLevel(userLevel);
	}

	@Override
	public void deleteUserById(long id) 
	{
		userRepository.delete(id);
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}
}
