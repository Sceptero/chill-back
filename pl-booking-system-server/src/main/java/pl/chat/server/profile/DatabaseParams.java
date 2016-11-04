package pl.chat.server.profile;

public enum DatabaseParams
{
	SQLITE_DRIVER("org.sqlite.JDBC", "Sterownik bazy SQLite."),
	SQLITE_PATH("jdbc:sqlite:./var/database/ChatServer.sqlite", "Ścieżka do bazy danych SQLite."),
	
	;

	private final String id;
	private final String desc;
	
	private DatabaseParams(
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
	
	public String getDesc()
	{
		return desc;
	}
}
