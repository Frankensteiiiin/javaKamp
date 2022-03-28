package ders3Odev2;

public class StudentManager extends UserManager {
	public void update(User user) {
		System.out.println(user.getFullName()+"güncellendi");		
	}
}
