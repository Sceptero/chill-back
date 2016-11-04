package pl.chat.server.db.manager;

import pl.chat.server.data.SignInData;
import pl.chat.server.data.User;
import pl.chat.server.db.ram.IDatabaseRAM;
import pl.chat.server.db.sql.IDatabaseSQL;

public class DatabaseManager 
	implements IDatabaseSQL, IDatabaseRAM
{

	private final IDatabaseSQL databaseSQL;
	private final IDatabaseRAM databaseRAM;
	
	public DatabaseManager(
			final IDatabaseSQL databaseSQL,
			final IDatabaseRAM databaseRAM
	)
	{
		this.databaseSQL = databaseSQL;
		this.databaseRAM = databaseRAM;
	}
	

	public void insertNewUser(
			User user
	) 
	{
		databaseSQL.insertNewUser(user);
		databaseRAM.insertNewUser(user);
	}


	public boolean signInValidation(
			SignInData signInData
	) 
	{
		return databaseSQL.signInValidation(signInData);
	}
	
}
