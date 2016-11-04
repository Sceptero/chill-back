package pl.chat.protocol.data.response;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRegistrationResponse implements IResponse
{
	private String response;
	
	@SuppressWarnings("unused")
	private UserRegistrationResponse()
	{
		
	}
	
	public UserRegistrationResponse(
			final String response
	)
	{
		this.response = response;
	}
	
	public String getResponse()
	{
		return response;
	}
}
