package pl.chat.server.main;


import java.util.logging.Logger;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import com.sun.jersey.spi.container.servlet.ServletContainer;
import pl.chat.server.model.Model;

public class BookingSystemServiceApp
{
	public static void main(final String[] args)
	{
		Model model = new Model();
		
		ServletHolder sh = new ServletHolder(ServletContainer.class);    
        sh.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", "com.sun.jersey.api.core.PackagesResourceConfig");
        sh.setInitParameter("com.sun.jersey.config.property.packages", "pl.chat.server.api");//Set the package where the services reside
        sh.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");
      
        Server server = new Server(9999);
        ServletContextHandler context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
        context.addServlet(sh, "/*");
 
        try
		{
			server.start();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
        try
		{
			server.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
