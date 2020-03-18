package view;

import java.util.HashMap;
import java.util.Map;

import constants.PageConstants;
import constants.ViewConstants;

public class ViewResolver {
	
		private Map<String, String> pages;
		
		public ViewResolver() {
			pages = new HashMap<String, String>()
			{{
				put(ViewConstants.DEFAULT_ERROR, PageConstants.PAGE_DEFAULT_ERROR);
				put(ViewConstants.LOGIN, PageConstants.PAGE_LOGIN);
				put(ViewConstants.LOGOUT, PageConstants.PAGE_LOGOUT);
				
				put(ViewConstants.ADD_USER, PageConstants.PAGE_ADD_USER);
				put(ViewConstants.DELETE_USER, PageConstants.PAGE_DELETE_USER);
				put(ViewConstants.EDIT_USER, PageConstants.PAGE_EDIT_USER);
				put(ViewConstants.HOME, PageConstants.PAGE_HOME);
				put(ViewConstants.LIST_USER, PageConstants.PAGE_LIST_USER);
				
			}};
		}
		
		public String getPage(String view) {
			if(pages.containsKey(view))
				return pages.get(view);
			//return default error page
			return null;
		}
		
		
	
}
