package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

class Rodent{
	@Override
	public String toString() {
		return "[Rodent]";
	}
	public static Iterator<Rodent> display(Iterator<Rodent> it) {
		while(it.hasNext()) {
			Rodent r = it.next();
			System.out.print(r);
		}
		System.out.println();
		return it;
	}
	
}

class Mouse2 extends Rodent{
	@Override
	public String toString() {
		return "[Mouse]";
	}
}

class Gerbil2 extends Rodent{
	@Override
	public String toString() {
		return "[Gerbil]";
	}
}

class Hamster2 extends Rodent{
	@Override
	public String toString() {
		return "[Hamster]";
	}
}


public class Ex10Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Rodent> rodents = new ArrayList<Rodent>();
		rodents.add(new Mouse2());
		rodents.add(new Gerbil2());
		rodents.add(new Hamster2());
		
		Rodent.display(rodents.iterator());
		HashSet<Rodent> hs = new HashSet<Rodent>();
		hs.add(new Gerbil2());
		hs.add(new Mouse2());
		hs.add(new Hamster2());
		Rodent.display(hs.iterator());
	}
}
