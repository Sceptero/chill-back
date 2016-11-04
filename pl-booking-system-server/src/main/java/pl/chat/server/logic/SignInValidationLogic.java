package pl.chat.server.logic;

import javax.ws.rs.core.Response;

import pl.chat.protocol.data.request.IRequest;
import pl.chat.protocol.data.request.SignInRequest;
import pl.chat.protocol.data.request.UserRegistrationRequest;
import pl.chat.protocol.data.response.IResponse;
import pl.chat.protocol.data.response.SignInResponse;
import pl.chat.server.data.SignInData;
import pl.chat.server.data.User;
import pl.chat.server.db.manager.DatabaseManager;

public class SignInValidationLogic
implements ILogic
{

private final DatabaseManager databaseManager;
	
	public SignInValidationLogic(
			final DatabaseManager databaseManager
	)
	{
		this.databaseManager = databaseManager;
	}
	
	public IResponse run(
			IRequest request
	) 
	{
		SignInData signInData = prepareSignInData(request);
		final boolean isValid = databaseManager.signInValidation(signInData);
		return new SignInResponse(isValid);
	}
	
	private SignInData prepareSignInData(
			IRequest request
	) {
		SignInRequest signInRequest = (SignInRequest)request;
		return new SignInData(
				signInRequest.getLogin(),
				signInRequest.getPassword()
		);
	}

}
