package booking.server.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import booking.server.entities.Resource;
import booking.server.enums.ResourceType;

 @Repository
public interface ResourcesRepository extends CrudRepository<Resource, Long>
{
	 List<Resource> findByType(ResourceType type);
}
