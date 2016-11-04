package pl.chat.server.db.sql;

import pl.chat.server.data.SignInData;
import pl.chat.server.data.User;

public interface IDatabaseSQL
{
	void insertNewUser(
			User user
	);
	
	boolean signInValidation(
			SignInData signInData
	);
}
