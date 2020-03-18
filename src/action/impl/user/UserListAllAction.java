package action.impl.user;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;

public class UserListAllAction extends AbstractAction{

	@Override
	public String execute(HttpServletRequest request) {
		
		return ViewConstants.LISTALL_USER;
	}

}
