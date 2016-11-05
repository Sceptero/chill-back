package booking.server.services.user;

import java.util.List;

import booking.server.entities.User;
import booking.server.enums.UserLevel;

public interface UserService {
	
	Iterable<User> getUsers();
	
	User getUserById(long id);
	
	void deleteUserById(long id);
	
	void saveUser(User user);

	List<User> getUserByLevel(UserLevel userLevel);
}
