package booking.server.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import booking.server.enums.ResourceType;

@Entity
public class Resource 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String description;
	
	@Enumerated(EnumType.ORDINAL)
	private ResourceType type;
	
	Resource()
	{
		
	}
	
	public Resource(
			final long id, 
			final String name,
			final String description,
			final ResourceType type) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public ResourceType getResourceType()
	{
		return type;
	}
}
