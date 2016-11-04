package pl.chat.protocol.data.request;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import pl.chat.protocol.defs.Gender;
import pl.chat.protocol.defs.RequestType;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRegistrationRequest 
	implements IRequest
{

	private String login;
	private String email;
	private int age;
	private Gender gender;
	private String password;
	
	@SuppressWarnings("unused")
	private UserRegistrationRequest()
	{
		//
	}
	
	public UserRegistrationRequest(
			final String login,
			final String email,
			final int age,
			final Gender gender,
			final String password)
	{
		if (login == null || login.isEmpty())
		{
			throw new IllegalArgumentException("login is null or empty.");
		}
		if (email == null || email.isEmpty())
		{
			throw new IllegalArgumentException("e-mail is null or empty.");
		}
		if (age < 13)
		{
			throw new IllegalArgumentException("age should be higher than 13.");
		}
		if (gender == null)
		{
			throw new IllegalArgumentException("gender is null.");
		}
		if (password == null || password.isEmpty())
		{
			throw new IllegalArgumentException("password is null or empty.");
		}
		this.login = login;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}
	
	public String getLogin() {
		return login;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public String getPassword() {
		return password;
	}

	public RequestType getRequestType() {
		return RequestType.USER_REGISTRATION;
	}

}
