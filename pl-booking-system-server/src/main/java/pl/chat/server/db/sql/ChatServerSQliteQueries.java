package pl.chat.server.db.sql;

public enum ChatServerSQliteQueries
{
	INSERT_NEW_USER(
			"INSERT INTO USER(Login, Email, Age, Gender, Password) " +
			"VALUES (?, ?, ?, ?, ?);",
			""),
	SELECT_USER(
			"SELECT * FROM USER WHERE Login = ? AND Password = ?;",
			""),
	
	;

	private final String id;
	private final String desc;
	
	private ChatServerSQliteQueries(
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
