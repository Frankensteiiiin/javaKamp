package eTicaret;

import eTicaret.business.concretes.UserLogInManager;
import eTicaret.business.concretes.UserRegistrationManager;
import eTicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserRegistrationManager userRegistration = new UserRegistrationManager();
		User user = new User(1, "ebru", "köþker", "ebrukosker@gmail.com", "123456", true);
		userRegistration.add(user);
		userRegistration.addToGoogle(user, true);
		User user1 = new User(1, "Ebru", null, null, "123456", true);
		UserLogInManager logInManager = new UserLogInManager();
		logInManager.logIn(user1);
	}

}
