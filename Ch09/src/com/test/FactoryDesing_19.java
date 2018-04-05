package com.test;

import java.util.Random;

interface Game{
	int actThrow();
}

interface GameFactory{
	Game getGame();
}

class CoinThrow implements Game{
	public int actThrow() {
		Random rand = new Random();
		return rand.nextInt(2);
	}
}

class CoinFactory implements GameFactory{
	@Override
	public Game getGame() {
		return new CoinThrow();
	}
}

class DiceThrow implements Game{
	@Override
	public int actThrow() {
		int result = 0;
		Random rand = new Random();
		while(result == 0) {
			result = rand.nextInt(7);
		}
		return result;
	}
}

class DiceFactory implements GameFactory{
	@Override
	public Game getGame() {
		return new DiceThrow();
	}
}

public class FactoryDesing_19 {
	public static int playGame(GameFactory gf) {
		Game g = gf.getGame();
		return g.actThrow();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(playGame(new CoinFactory()) == 0) {
			System.out.println("앞면입니다.");
		}else {
			System.out.println("뒷면입니다.");
		}
		System.out.println("나온 주사위 눈금은 " + playGame(new DiceFactory())
		+"입니다.");
	}

}
