package booking.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import booking.server.entities.Resource;
import booking.server.enums.ResourceType;
import booking.server.services.resources.ResourcesService;

@RestController
@RequestMapping("/api/resource")
public class ResourceController {

	@Autowired
	private ResourcesService resourceService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Resource> getResources()
	{
		return resourceService.getResources();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String saveResource(@RequestBody Resource resource)
	{
		resourceService.saveResource(resource);
		return "ok";
	}
	
	@RequestMapping(value = "/get-by-id/{id}", method = RequestMethod.GET)
	public Resource getResourceById(
			@PathVariable("id") long id)
	{ 
		return resourceService.getById(id);
	}
	
	@RequestMapping(value = "/get-by-type/{typeId}", method = RequestMethod.GET)
	public List<Resource> getByType(
			@PathVariable("typeId") int typeId)
	{
		ResourceType type = ResourceType.fromInt(typeId);
		return resourceService.getByType(type);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteResourceById(
			@PathVariable("id") long id)
	{
		resourceService.deleteById(id);
	}
}
