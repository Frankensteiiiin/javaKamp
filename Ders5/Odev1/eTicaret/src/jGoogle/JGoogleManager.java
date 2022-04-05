package jGoogle;

public class JGoogleManager {
	public boolean accountCheck(boolean check) {
		if (check)
			System.out.println("Google hesabý ile eklendi :");
		else
			System.out.println("Google hesabý kayýtlý deðil:");
		return check;
	}
}
