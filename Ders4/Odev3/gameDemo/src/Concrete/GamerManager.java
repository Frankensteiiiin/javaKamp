package Concrete;

import Abstract.IGamerCheckService;
import Abstract.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService {

	private IGamerCheckService gamerCheckService;

	public GamerManager(IGamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}



	@Override
	public void Save(Gamer gamer) {
		if (gamerCheckService.CheckIfRealPerson(gamer))
			System.out.println("kay�t ba�ar�l� :"+gamer.firstName);
		else
			System.out.println("yanl�� bilgi giri�i");
		
	}

}
