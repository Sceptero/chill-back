package booking.server.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resource 
{
	@Id
	private final long id;

	@Column(name="name")
	private final String name;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	
	private Resource()
	{
		
	}
	public Resource(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
