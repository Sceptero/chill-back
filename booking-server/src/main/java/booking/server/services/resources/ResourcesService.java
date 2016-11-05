package booking.server.services.resources;

import java.util.List;

import booking.server.entities.Resource;
import booking.server.enums.ResourceType;

public interface ResourcesService 
{
	Iterable<Resource> getResources();
	
	void saveResource(Resource resource);
	
	void deleteById(long id);
	
	Resource getById(long id);
	
	List<Resource> getByType(ResourceType type);
	
}
