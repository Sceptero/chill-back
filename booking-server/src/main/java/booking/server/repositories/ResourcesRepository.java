package booking.server.repositories;

import java.util.HashMap;
import java.util.Map;

import booking.server.entities.Resource;

 
public class ResourcesRepository 
{
	private static Map<Long, Resource> resources;
	
	static
	{
		resources = new HashMap<Long, Resource>();
	}
	
	public Map<Long, Resource> getResources()
	{
		return resources;
	}
	
	public Resource getResourceById(final long id)
	{
		return resources.get(id);
	}
	
	public void deleteResourceById(final long id)
	{
		resources.remove(id);
	}
}
