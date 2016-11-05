package booking.server.services.user;

import booking.server.entities.User;

public interface UserService {
	
	Iterable<User> getUsers();
	
	User getUserById(long id);
	
	void deleteUserById(long id);
	
	void saveUser(User user);
}
