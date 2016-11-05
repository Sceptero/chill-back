package booking.server.entities;

import enums.UserLevel;

public class User 
{
	private final int id;
	private final String login;
	private final String password;
	private final UserLevel userLevel;

	public User(int id, String login, String password, UserLevel userLevel) {
		this.id = id;
		this.login = login;
		this.password = password;
		this.userLevel = userLevel;
	}

	public int getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public UserLevel getUserLevel() {
		return userLevel;
	}

}
