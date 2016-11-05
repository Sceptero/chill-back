package booking.server.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import booking.server.enums.UserLevel;

@Entity
public class User implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(unique = true)
	private String login;
	
	@NotNull
	private String password;
	
	@Enumerated(EnumType.ORDINAL)
	@NotNull
	private UserLevel userLevel;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Booking> bookings;
	
	User()
	{ 
	}

	public User(int id, String login, String password, UserLevel userLevel, Set<Booking> bookings) {
		this.id = id;
		this.login = login;
		this.password = password;
		this.userLevel = userLevel;
		this.bookings = bookings;
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
	
	public Set<Booking> getBookings() {
		return bookings;
	}

}
