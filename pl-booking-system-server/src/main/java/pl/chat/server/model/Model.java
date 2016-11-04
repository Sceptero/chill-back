package pl.chat.server.model;


import pl.chat.server.api.JsonLogicFacade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.chat.server.api.BookingSystemApi;
import pl.chat.server.db.manager.DatabaseManager;
import pl.chat.server.db.ram.DatabaseRAM;
import pl.chat.server.db.sql.DatabaseSQL;
import pl.chat.server.logic.LogicFactory;

public class Model
{
	private final DatabaseManager databaseManager;
	private final JsonLogicFacade jsonLogicFacade;
	private final LogicFactory logicFactory;
	
	public Model()
	{
		
		databaseManager = createDatabaseManager();
		
		logicFactory = new LogicFactory(databaseManager);
		
		jsonLogicFacade = new JsonLogicFacade(
				logicFactory);

		BookingSystemApi.init(jsonLogicFacade);
	}

	private DatabaseManager createDatabaseManager() 
	{
		return new DatabaseManager(
				new DatabaseSQL(),
				new DatabaseRAM()
		);
	}
}
