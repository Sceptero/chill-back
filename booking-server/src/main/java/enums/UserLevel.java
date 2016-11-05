package enums;

public enum UserLevel {

	USER(1),
	
	ADMIN(100),
	
	;
	
	private final int id;
	
	UserLevel(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
}
