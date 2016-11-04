package pl.chat.server.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pl.chat.protocol.data.request.SignInRequest;
import pl.chat.protocol.data.request.UserRegistrationRequest;
import pl.chat.protocol.data.response.IResponse;
import pl.chat.protocol.data.response.SignInResponse;
import pl.chat.protocol.data.response.UserRegistrationResponse;

@Path("/api")
public class BookingSystemApi 
{
	private static JsonLogicFacade jsonLogicFacade;
	
	public static void init(
			final JsonLogicFacade logicFacade)
	{
		jsonLogicFacade = logicFacade;
	}
	
	@POST
	@Path("/user-registration")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UserRegistrationResponse userSync(
			final UserRegistrationRequest userRegistrationRequest)
	{
		return (UserRegistrationResponse)jsonLogicFacade.run(userRegistrationRequest);
	}
	
	@POST
	@Path("/sign-in")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public SignInResponse signIn(
			final SignInRequest request)
	{
		return (SignInResponse)jsonLogicFacade.run(request);
	}
	
	
	
	

}
