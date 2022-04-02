package gameDemo;

import java.util.Date;


import Concrete.GameSaleManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager=new GamerManager(new GamerCheckManager());
	    Date date=new Date();
	    gamerManager.Save(new Gamer(1,"ebru","kosker",date,"737792898929"));
	    Game game =new Game(2,"oyun1",50);
	    Campaign campaign=new Campaign(3,20);
	    GameSaleManager saleManager=new GameSaleManager();
	    saleManager.add(campaign, game);
	    
	}

}
