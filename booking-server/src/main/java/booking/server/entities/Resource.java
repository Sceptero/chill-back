package booking.server.entities;

public class Resource 
{
	private final long id;
	private final String name;
	
	public Resource(long id, String name) {
		super();
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