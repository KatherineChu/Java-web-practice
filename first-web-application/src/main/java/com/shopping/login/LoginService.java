package com.shopping.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("katherine") && password.equals("12345678"))
			return true;
		return false;
	}
}
