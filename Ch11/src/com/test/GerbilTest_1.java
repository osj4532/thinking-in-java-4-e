package com.test;

import java.util.ArrayList;

class Gerbil{
	static int id;
	int number;
	public Gerbil() {
		number = id;
		id++;
	}
	
	public void hop() {
		System.out.println("Gerbil : " + number);
	}
}

public class GerbilTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Gerbil> gerbilArr = new ArrayList<Gerbil>();
		gerbilArr.add(new Gerbil());
		gerbilArr.add(new Gerbil());
		gerbilArr.add(new Gerbil());
		gerbilArr.add(new Gerbil());
		gerbilArr.add(new Gerbil());
		gerbilArr.add(new Gerbil());
		
		for(Gerbil g : gerbilArr) {
			g.hop();
		}
		
	}

}
