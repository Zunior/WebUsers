package listener;

import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import domain.User;

/**
 * Application Lifecycle Listener implementation class MyContextListener
 *
 */
@WebListener
public class MyContextListenerArray implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyContextListenerArray() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	 sce.getServletContext().setAttribute("users", new ArrayList<User>() {{
    		 add(new User("Sasa", "Popovic", "sasa", "12345"));
    		 add(new User("Pera", "Peric", "pera", "12345"));
    		 add(new User("Mika", "Mikic", "mika", "12345"));
    	 }});
    	 sce.getServletContext().setAttribute("activeUsers", new ArrayList<User>() {{

    	 }});
    	 
    	 
    }
    
    
	
}
