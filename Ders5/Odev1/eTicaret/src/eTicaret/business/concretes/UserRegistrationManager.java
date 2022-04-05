package eTicaret.business.concretes;

import eTicaret.business.abstracts.EMailCheckServis;
import eTicaret.business.abstracts.EMailSendingService;
import eTicaret.business.abstracts.UserGoogleService;
import eTicaret.business.abstracts.UserService;
import eTicaret.entities.concretes.User;
import jGoogle.JGoogleManager;

public class UserRegistrationManager implements UserService, EMailCheckServis, EMailSendingService,UserGoogleService {
	@Override
	public void add(User user) {
		if (user.getPassword().length() > 5 && user.getePosta().contains("@") && user.getFirstName().length() > 1
				&& user.getLastName().length() > 1 && eMailCheck(user)) {
			System.out.println("Kullanýcý eklendi :" + user.getFirstName() + " " + user.getLastName());
			System.out.println(emailSending);
			if (verification)
				System.out.println("üyelik tamamlandý");
			else
				System.out.println("doðulama yapýlmadý");
		} else {
			System.out.println("Geçersiz bilgi girildi");
		}

	}

	@Override
	public boolean eMailCheck(User user) {
		if (user.getCheck())
			return true;
		else
			return false;
	}

	@Override
	public void addToGoogle(User user,boolean check) {
		JGoogleManager googleManager=new JGoogleManager();
		googleManager.accountCheck(check);
		
	}

}
