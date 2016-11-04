package pl.chat.server.logic;

import pl.chat.protocol.defs.RequestType;
import pl.chat.server.db.manager.DatabaseManager;

public class LogicFactory
{
	
	private final DatabaseManager databaseManager;
	
	public LogicFactory(
			final DatabaseManager databaseManager
	)
	{
		this.databaseManager = databaseManager;
	}
	
	public ILogic getLogic(
			RequestType requestType
	)
	{
		switch(requestType)
		{
			case USER_REGISTRATION:
				return new UserRegistrationLogic(databaseManager);
			case SIGN_IN:
				return new SignInValidationLogic(databaseManager);
				default:
					throw new IllegalArgumentException("Unhandled switch TODO"); // TODO unhandled switch 
		}
	}
}
