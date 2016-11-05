package booking.server.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import booking.server.entities.User;
import booking.server.enums.UserLevel;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{
	List<User> findByUserLevel(UserLevel userLevel);

	User findByLogin(String login);
}
