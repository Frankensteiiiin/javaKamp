package Concrete;

import Abstract.IGamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements IGamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		// TODO Auto-generated method stub
		return true;
	}

}
