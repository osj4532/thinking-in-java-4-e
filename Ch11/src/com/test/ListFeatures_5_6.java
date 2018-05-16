package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


class Pet{

	String animal; 
	public Pet(String animal) {
		this.animal = animal;
	}
	
	@Override
	public String toString() {
		return animal;
	}

	public String id() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Pets extends Pet{
	private static String[] item = {"Rat","Manx", "Cymric", "Mutt", "Pug", "Cymric", "Pug"};
	public Pets(String animal) {
		super(animal);
		// TODO Auto-generated constructor stub
	}

	static List<Pet> arrayList(int i) {
		List<Pet> pets = new ArrayList<Pet>();
		for(int j = 0; j < i; j++) {
			pets.add(new Pet(item[j]));
		}
		return pets;
	}
}

class Hamster extends Pet{
	public Hamster() {
		super("Hamster");
	}
}

class Cymric extends Pet {
	public Cymric() {
		super("Cymric");
	}
}

class Mouse extends Pet{
	public Mouse() {
		super("Mouse");
	}
}
public class ListFeatures_5_6 {

	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(13);
		ints.add(25);
		ints.add(31);
		ints.add(21);
		ints.add(45);
		ints.add(1);
		ints.add(6);
		System.out.println("1 : " + ints);
		Integer h = new Integer(11);
		ints.add(h);
		System.out.println("2 : " + ints);
		System.out.println("3 : " + ints.contains(h));
		ints.remove(h);
		Integer p = ints.get(2);
		System.out.println("4 : " + p + " " + ints.indexOf(p));
		Pet cymric = new Cymric();
		System.out.println("5 : " + ints.indexOf(cymric));
		System.out.println("6 : " + ints.remove(cymric));
		System.out.println("7 : " + ints.remove(p));
		System.out.println("8 : " + ints);
		ints.add(3, new Integer(17));
		System.out.println("9 : " + ints);
		List<Integer> sub = ints.subList(1, 4);
		System.out.println("subList : " + sub);
		System.out.println("10 : " + ints.containsAll(sub));
		Collections.sort(sub);
		System.out.println("sorted subList : " + sub);
		System.out.println("11 : " + ints.containsAll(sub));
		Collections.shuffle(sub,rand);
		System.out.println("shuffled subList : " + sub);
		System.out.println("12 : " + ints.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(ints);
		sub = Arrays.asList(ints.get(1), ints.get(4));
		System.out.println("sub : " + sub);
		copy.retainAll(sub);
		System.out.println("13 : " + copy);
		copy = new ArrayList<Integer>(ints);
		copy.remove(2);
		System.out.println("14 : " + copy);
		copy.removeAll(sub);
		System.out.println("15 : " + copy);
		copy.set(1, new Integer(88));
		System.out.println("16 : " + copy);
		copy.addAll(2, sub);
		System.out.println("17 : " + copy);
		System.out.println("18 : " + ints.isEmpty());
		ints.clear();
		System.out.println("19 : " + ints);
		System.out.println("20 : " + ints.isEmpty());
		List<Integer> i = new ArrayList<Integer>();
		i.add(4);
		i.add(8);
		i.add(41);
		i.add(24);
		ints.addAll(i);
		System.out.println("21 : " + ints);
		Object[] o = ints.toArray();
		System.out.println("22 : " + o[3]);
	}

}
