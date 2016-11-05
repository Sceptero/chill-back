package booking.server.enums;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum UserLevel {

	USER(1),
	
	ADMIN(100),
	
	;
	
	private static Map<Integer, UserLevel> ENUM_MAP = new HashMap<>(); 
	
	static
	{
		for(UserLevel userLevel : UserLevel.values())
		{
			ENUM_MAP.put(userLevel.getId(), userLevel);
		}
	}
	
	private final int id;
	
	UserLevel(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	@JsonCreator
	public static UserLevel fromInt(int id)
	{
		UserLevel userLevel = ENUM_MAP.get(id);
		if (userLevel == null)
		{
			throw new IllegalArgumentException("Unknown UserLevel");
		}
		return userLevel;
	}

}
