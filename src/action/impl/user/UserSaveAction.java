package action.impl.user;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;

public class UserSaveAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		List<User> users = (List<User>) request.getServletContext().getAttribute("users");
		if(users == null)
			users = new ArrayList<User>();
		
		String saveMessage = "";
		
		String name = (String) request.getParameter("nameUser");
		String surname = (String) request.getParameter("surnameUser");
		String username = (String) request.getParameter("usernameUser");
		String password = (String) request.getParameter("passwordUser");
		
		User user = new User(name, surname, username, password);
		for(User user1 : users)
			if(!user1.getUsername().equalsIgnoreCase(user.getUsername())) {
				users.add(user);
				request.getServletContext().setAttribute("users", users);
				break;
			}else {
				saveMessage = "Korisnik sa zadatim username-om vec postoji!";
				request.setAttribute("saveMessage", saveMessage);
				return ViewConstants.ADD_USER;
			}
		
		
		return ViewConstants.HOME;
	}

}
