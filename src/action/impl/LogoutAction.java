package action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;

public class LogoutAction extends AbstractAction{

	@Override
	public String execute(HttpServletRequest request) {
		User currentUser = (User) request.getSession().getAttribute("currentUser");
		List<User> activeUsers = (List<User>) request.getServletContext().getAttribute("activeUsers");
		activeUsers.remove(currentUser);
		request.getServletContext().setAttribute("activeUsers", activeUsers);
		
		request.getSession().invalidate();
		
		return ViewConstants.LOGOUT;
	}

}
