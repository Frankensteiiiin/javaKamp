package ders3Odev2;

public class Main {

	public static void main(String[] args) {
		Student student=new Student();
		student.setFullName("ebru köşker");
		Instructor instructor= new Instructor();
		instructor.setFullName("engin demiroğ");
		User[] users=new User[] {student,instructor};
		UserManager userManager=new UserManager();
		for(User user:users) {
			userManager.add(user);
		}
		
	}

}
