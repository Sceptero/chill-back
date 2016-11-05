package booking.server.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import booking.server.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{
	
}
