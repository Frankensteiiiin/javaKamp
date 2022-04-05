package eTicaret.business.concretes;

import eTicaret.business.abstracts.UserLogInService;
import eTicaret.entities.concretes.User;

public class UserLogInManager implements UserLogInService {

	@Override
	public void logIn(User user) {
		if(user.getFirstName()!=null&&user.getPassword()!=null) {
			System.out.println("kullan�c� giri�i yap�ld�");
		}
		else
			System.out.println("eksik bilgi giri�i yap�ld�");
	}

}
