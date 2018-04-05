package com.example;

class Game{
	public Game(int i){
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game{
	public BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}

public class Chess_6 extends BoardGame{
	public Chess_6() {
		super(11);
		System.out.println("Chess constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chess_6 chess = new Chess_6();
	}

}
