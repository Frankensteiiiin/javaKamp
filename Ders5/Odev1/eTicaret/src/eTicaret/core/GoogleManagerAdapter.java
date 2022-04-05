package eTicaret.core;

import jGoogle.JGoogleManager;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void logToSystem(boolean check) {
		JGoogleManager manager=new JGoogleManager();
		manager.accountCheck(check);
	}

}
