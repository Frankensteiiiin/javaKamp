package Concrete;

import Entities.Campaign;
import Entities.Game;

public class GameSaleManager extends CampaignManager {
	
	@Override
	public void add(Campaign campaign, Game game) {
		int sonuc=game.getPrice()*(100-campaign.getCampaignAmount())/100;
		System.out.println("indirimli ürün fiyatý  :"+sonuc);
		
	}

	

}
