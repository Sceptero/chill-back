package booking.server.enums;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ResourceType
{
	CAR(1),
	ROOM(100),
	GAME_CONSOLE(200),
	;
	
	private static Map<Integer, ResourceType> ENUM_MAP = new HashMap<>(); 
	
	static
	{
		for(ResourceType enumValue : ResourceType.values())
		{
			ENUM_MAP.put(enumValue.getId(), enumValue);
		}
	}
	
	private final int id;
	
	ResourceType(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	@JsonCreator
	public static ResourceType fromInt(int id)
	{
		ResourceType resourceType = ENUM_MAP.get(id);
		if (resourceType == null)
		{
			throw new IllegalArgumentException("Unknown ResourceType");
		}
		return resourceType;
	}
}
