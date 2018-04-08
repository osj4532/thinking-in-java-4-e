package com.test;

import java.util.Random;

interface Games {
	void play();
}

interface GamesFactory {
	Games getGames();
}

class CoinToss implements Games {
	Random rand = new Random();
	public void play() { 
		System.out.print("Toss Coin: ");
		switch(rand.nextInt(2)) {
			case 0 : System.out.println("Heads"); return;
			case 1 : System.out.println("Tails"); return;
			default: System.out.println("OnEdge"); return;
		} 
	}
	public static GamesFactory getFactory() {
		return new GamesFactory() {
			@Override
			public Games getGames() {
				return new CoinToss();
			}
		};
	}
}

class DiceThrow implements Games {
	Random rand = new Random();
	public void play() { 
		System.out.print("Throw Dice: " + (rand.nextInt(6) + 1));		
	}
	public static GamesFactory getFactory() {
		return new GamesFactory() {
			@Override
			public Games getGames() {
				return new DiceThrow();
			}
		};
	}
}
public class InnerClassTest_17 {
	public static void getGame(GamesFactory gf) {
		Games g = gf.getGames();
		g.play();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getGame(CoinToss.getFactory());
		getGame(DiceThrow.getFactory());
	}

}
