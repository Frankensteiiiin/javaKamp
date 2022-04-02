package Concrete;

import Entities.Game;

public abstract class GameManager {
	public String gameName;
	public void add(Game game) {
		System.out.println("oyun eklendi :"+game.getGameName());
		this.gameName=game.getGameName();
	}

}
