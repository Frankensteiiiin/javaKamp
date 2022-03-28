package ders3Odev2;

public class Student extends User {
	private String profilPicture;

	public Student() {
		super();
	}

	public Student(String profilPicture) {
		super();
		this.profilPicture = profilPicture;
	}

	public String getProfilPicture() {
		return profilPicture;
	}

	public void setProfilPicture(String profilPicture) {
		this.profilPicture = profilPicture;
	}
	
}
