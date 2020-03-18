package action.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;

public class LoginAction extends AbstractAction{

	@Override
	public String execute(HttpServletRequest request) {
		List<User> users = (List<User>) request.getServletContext().getAttribute("users");
		if(users == null) {
			users = new ArrayList<User>();
		}
		
		String page = ViewConstants.LOGIN;
		String errorMessage = "Trazeni username-password ne postoji!";
		
		boolean ispavno = false;
		String username = request.getParameter("usernameUser");
		String password = request.getParameter("passwordUser");
		for (User user : users) {
			if(user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				HttpSession session = request.getSession(true);
				page = ViewConstants.HOME;
				session.setAttribute("currentUser", user);
				List<User> activeUsers = (List<User>) request.getServletContext().getAttribute("activeUsers");
				if(!activeUsers.contains(user)) {
					activeUsers.add(user);
				}
				ispavno = true;
				break;
			}else {
				
			}
		}
		if (!ispavno)	
			request.setAttribute("errorMessage", errorMessage);
	
		return page;
	}
	
}
