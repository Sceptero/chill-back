package pl.chat.server.data;

public class SignInData
{
	private final String login;
	private final String password;
	
	public SignInData(
			final String login,
			final String password
	)
	{
		this.login = login;
		this.password = password;
	}
	
	public String getLogin()
	{
		return login;
	}
	
	public String getPassword()
	{
		return password;
	}
}
