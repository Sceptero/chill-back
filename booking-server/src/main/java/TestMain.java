import com.google.gson.Gson;

import booking.server.entities.User;
import booking.server.enums.UserLevel;

public class TestMain {

	public static void main(String[] args) {
		Gson gson = new Gson();
		User user = new User(1, "pusty", "aaaa", UserLevel.ADMIN);
		String json = gson.toJson(user);
		System.out.println(json);
	}
}
