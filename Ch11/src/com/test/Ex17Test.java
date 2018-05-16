package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Gerbil3{
	static int id;
	int number;
	public Gerbil3() {
		number = id;
		id++;
	}
	
	public void hop() {
		System.out.println("Gerbil : " + number);
	}
}

public class Ex17Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Gerbil3> m = new HashMap<String,Gerbil3>();
		m.put("A",new Gerbil3());
		m.put("B",new Gerbil3());
		m.put("C",new Gerbil3());
		m.put("D",new Gerbil3());
		m.put("E",new Gerbil3());
		m.put("F",new Gerbil3());
		
	
		Iterator<String> it = m.keySet().iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s + " : ");
			m.get(s).hop();
		}
		
	}

}
