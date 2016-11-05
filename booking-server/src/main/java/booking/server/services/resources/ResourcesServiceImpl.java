package booking.server.services.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import booking.server.entities.Resource;
import booking.server.repositories.ResourcesRepository;

@Service
public class ResourcesServiceImpl implements ResourcesService
{
	@Autowired
	ResourcesRepository resourceRepository;

	public Iterable<Resource> getResources() 
	{
		return resourceRepository.findAll();
	}

	public void saveResource(Resource resource) 
	{
		resourceRepository.save(resource);
	}

	public void deleteById(long id) 
	{
		resourceRepository.delete(id);
	}

	public Resource getById(long id) 
	{
		return  resourceRepository.findOne(id);
	}
}
