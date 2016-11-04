package pl.chat.protocol.defs;

public enum UserStatus 
{

	INACTIVE(0),
	ACTIVE(1),
	
	;
	
	private final int id;
	
	UserStatus(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
}
