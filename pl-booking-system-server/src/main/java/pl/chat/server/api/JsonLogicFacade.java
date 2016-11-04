package pl.chat.server.api;

import javax.ws.rs.core.Response;

import pl.chat.protocol.data.request.IRequest;
import pl.chat.protocol.data.response.IResponse;
import pl.chat.protocol.data.response.SignInResponse;
import pl.chat.server.logic.ILogic;
import pl.chat.server.logic.LogicFactory;

public class JsonLogicFacade
{

	private LogicFactory logicFactory;
	
	public JsonLogicFacade(
			final LogicFactory logicFactory
	)
	{
		this.logicFactory = logicFactory;
	}
	
	public IResponse run(
			IRequest request
	)
	{
		ILogic logic = logicFactory.getLogic(request.getRequestType());
		SignInResponse a =  (SignInResponse)logic.run(request);
		return a;
	}

}
