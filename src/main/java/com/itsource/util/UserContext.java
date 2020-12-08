package com.itsource.util;


import com.aigou.crm.pojo.Employee;
import org.apache.shiro.SecurityUtils;

public class UserContext {
	public static String USER_IN_SESSION  = "user_in_session";

	public static Employee getUserInSession() {
		return (Employee) SecurityUtils.getSubject().getSession().getAttribute(USER_IN_SESSION);
	}
	
	public static void putUserToSession(Employee user) {
		SecurityUtils.getSubject().getSession().setAttribute(USER_IN_SESSION, user);
	}
	
}
