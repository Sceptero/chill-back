package booking.server.services.user;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import booking.server.entities.User;
import booking.server.enums.UserLevel;
import booking.server.exceptions.NotFoundException;
import booking.server.repositories.UserRepository;

@Service
public class UserServiceImpl
	implements UserService{
	
	@Autowired
	private UserRepository userRepository; 
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers()
	{
		Iterable<User> users = userRepository.findAll();
		if (users == null)
		{
			throw new NotFoundException("Not found");
		}
		Iterator<User> iterator = users.iterator();
		if (iterator == null)
		{
			throw new NotFoundException("Not found");
		}
		List<User> list = IteratorUtils.toList(iterator);
		if (CollectionUtils.isEmpty(list))
		{
			throw new NotFoundException("Not found");
		}
		return list;
	}

	@Override
	public User getUserById(long id) 
	{
		User user = userRepository.findOne(id);
		if (user == null)
		{
			throw new NotFoundException("Not found");
		}
		return user;
	}
	
	@Override
	public List<User> getUserByLevel(UserLevel userLevel) {
		List<User> users = userRepository.findByUserLevel(userLevel);
		if (CollectionUtils.isEmpty(users)) 
		{
			throw new NotFoundException("Not found");
		}
		return users;
	}

	@Override
	public void deleteUserById(long id) 
	{
		userRepository.delete(id);
	}
	
	@Override
	public User getUserByLogin(String login) {
		User user = userRepository.findByLogin(login);
		if (user == null)
		{
			throw new NotFoundException("Not found");
		}
		return user;
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}
}
