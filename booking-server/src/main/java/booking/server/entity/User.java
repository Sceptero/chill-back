package booking.server.entity;

public class User 
{
	private final int id;
	private final String name;
	private final String courese;

	public User(int id, String name, String courese) 
	{
		this.id = id;
		this.name = name;
		this.courese = courese;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCourese() {
		return courese;
	}
	
}
