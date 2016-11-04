package pl.chat.server.db.ram;

import pl.chat.server.data.User;

public interface IDatabaseRAM
{
	void insertNewUser(
			User user
	);
}
