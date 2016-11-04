package pl.chat.protocol.defs;

import java.util.HashMap;
import java.util.Map;

public enum RequestType 
{
	USER_REGISTRATION("user-registration", "Registration of user."),
	
	;
	
	private String id;
	private String desc;
	
	Map<String, RequestType> ENUM_MAP = new HashMap<String, RequestType>();
	
	private RequestType(
		final String id,
		final String desc
	)
	{
		this.id = id;
		this.desc = desc;
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getDescription()
	{
		return desc;
	}
	
	public RequestType getInstance(
		final String id
	)
	{
		return ENUM_MAP.get(id);
	}
}
