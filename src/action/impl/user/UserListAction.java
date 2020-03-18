package action.impl.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;

public class UserListAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
//		List<User> activeUsers = (List<User>) request.getServletContext().getAttribute("activeUsers");
//		if(activeUsers == null)
//			activeUsers = new ArrayList<User>();
		
		
		return ViewConstants.LIST_USER;
	}

}
