package booking.server.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import booking.server.entities.Resource;

 @Repository
public interface ResourcesRepository extends CrudRepository<Resource, Long>
{

}
