package eTicaret.business.concretes;

import eTicaret.business.abstracts.UserLogInService;
import eTicaret.entities.concretes.User;

public class UserLogInManager implements UserLogInService {

	@Override
	public void logIn(User user) {
		if(user.getFirstName()!=null&&user.getPassword()!=null) {
			System.out.println("kullanýcý giriþi yapýldý");
		}
		else
			System.out.println("eksik bilgi giriþi yapýldý");
	}

}
