package booking.server.services.resources;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import booking.server.entities.Resource;
import booking.server.enums.ResourceType;
import booking.server.repositories.ResourcesRepository;

@Service
public class ResourcesServiceImpl implements ResourcesService
{
	@Autowired
	ResourcesRepository resourceRepository;

	@SuppressWarnings("unchecked")
	public List<Resource> getResources() 
	{
		Iterable<Resource> iterable = resourceRepository.findAll();
		Iterator<Resource> iterator = iterable.iterator();
		return IteratorUtils.toList(iterator);
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

	public List<Resource> getByType(ResourceType type)
	{
		List<Resource> a = resourceRepository.findByType(type);
		return a;
	}
}
