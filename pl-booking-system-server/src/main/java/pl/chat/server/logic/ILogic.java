package pl.chat.server.logic;



import javax.ws.rs.core.Response;

import pl.chat.protocol.data.request.IRequest;
import pl.chat.protocol.data.response.IResponse;

public interface ILogic
{
	IResponse run(IRequest request);
}
