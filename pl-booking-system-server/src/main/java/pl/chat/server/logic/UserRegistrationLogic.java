package pl.chat.server.logic;


import javax.ws.rs.core.Response;

import pl.chat.protocol.data.request.IRequest;
import pl.chat.protocol.data.request.UserRegistrationRequest;
import pl.chat.protocol.data.response.IResponse;
import pl.chat.protocol.data.response.UserRegistrationResponse;
import pl.chat.server.data.User;
import pl.chat.server.db.manager.DatabaseManager;

public class UserRegistrationLogic
	implements ILogic
{
	
	private final DatabaseManager databaseManager;
	
	public UserRegistrationLogic(
			final DatabaseManager databaseManager
	)
	{
		this.databaseManager = databaseManager;
	}

	public IResponse run(
			IRequest request
	) 
	{
		final User user = prepareNewUser(request);
		databaseManager.insertNewUser(user);
		return new UserRegistrationResponse(Response.ok().build());
	}

	private User prepareNewUser(
			IRequest request
	) {
		UserRegistrationRequest userRegistrationRequest = (UserRegistrationRequest)request;
		return new User(
				userRegistrationRequest.getLogin(),
				userRegistrationRequest.getEmail(),
				userRegistrationRequest.getAge(),
				userRegistrationRequest.getGender(),
				userRegistrationRequest.getPassword()
		);
	}

}
