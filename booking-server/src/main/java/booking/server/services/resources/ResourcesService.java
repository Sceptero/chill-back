package booking.server.services.resources;

import booking.server.entities.Resource;

public interface ResourcesService 
{
	Iterable<Resource> getResources();
	
	void saveResource(Resource resource);
	
	void deleteById(long id);
	
	Resource getById(long id);
	
}
