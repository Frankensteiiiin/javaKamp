package jGoogle;

public class JGoogleManager {
	public boolean accountCheck(boolean check) {
		if (check)
			System.out.println("Google hesab� ile eklendi :");
		else
			System.out.println("Google hesab� kay�tl� de�il:");
		return check;
	}
}
