package pl.chat.protocol.defs;

import java.util.HashMap;
import java.util.Map;

public enum Gender
{
	MALE(0),
	FEMALE(1),
	;
	
	private int id;
	
	Map<String, Gender> ENUM_MAP = new HashMap<String, Gender>();
	
	private Gender(
		final int id
	)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public Gender getInstance(
			final int id
	)
	{
		return ENUM_MAP.get(id);
	}
}
