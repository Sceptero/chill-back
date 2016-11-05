package booking.server.entities;

import javax.persistence.*;

import booking.server.enums.UserLevel;

@Entity
public class User  
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String login;
	private String password;
	
	@Enumerated(EnumType.ORDINAL)
	private UserLevel userLevel;
	
	User()
	{ 
	}

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
