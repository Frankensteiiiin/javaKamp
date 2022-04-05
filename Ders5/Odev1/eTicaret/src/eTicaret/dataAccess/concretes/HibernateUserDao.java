package eTicaret.dataAccess.concretes;

import java.util.List;

import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("hibernate ile eklendi :"+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("hibernate ile güncellendi :"+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("hibernate ile silindi :"+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
