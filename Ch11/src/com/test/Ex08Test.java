package com.test;

import java.util.ArrayList;
import java.util.Iterator;

class Gerbil1{
	static int id;
	int number;
	public Gerbil1() {
		number = id;
		id++;
	}
	
	public static void hop(Iterator<Gerbil1> it) {
		while(it.hasNext()) {
			Gerbil1 g = it.next();
			System.out.println("Gerbil : " + g.number);
		}
		
	}
}

public class Ex08Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Gerbil1> gerbilArr = new ArrayList<Gerbil1>();
		gerbilArr.add(new Gerbil1());
		gerbilArr.add(new Gerbil1());
		gerbilArr.add(new Gerbil1());
		gerbilArr.add(new Gerbil1());
		gerbilArr.add(new Gerbil1());
		gerbilArr.add(new Gerbil1());
		
		
		Gerbil1.hop(gerbilArr.iterator());
		
	}

}
