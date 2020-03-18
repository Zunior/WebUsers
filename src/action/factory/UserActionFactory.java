package action.factory;

import action.AbstractAction;
import action.impl.user.UserAddAction;
import action.impl.user.UserDeleteAction;
import action.impl.user.UserEditAction;
import action.impl.user.UserListAction;
import action.impl.user.UserSaveAction;

public class UserActionFactory {
	public static AbstractAction createActionFactory(String actionName) {
		AbstractAction action = null;
		
		if(actionName.equalsIgnoreCase("list")) {
			action = new UserListAction();
		}
		
		if(actionName.equalsIgnoreCase("add")) {
			action = new UserAddAction();
		}
		
		if(actionName.equalsIgnoreCase("delete")) {
			action = new UserDeleteAction();
		}
		
		if(actionName.equalsIgnoreCase("edit")) {
			action = new UserEditAction();
		}
		
		if(actionName.equalsIgnoreCase("save")) {
			action = new UserSaveAction();
		}
		
		return action;
	}

}
