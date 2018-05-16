package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

interface Selector{
	boolean end();
	Object current();
	void next();
}

public class Ex09Test {

	private Object[] items;
	private int next = 0;
	public Ex09Test(int size) {
		items = new Object[size];
	}
	
	public String toString() {
		return "Sequence.toString()";
	}
	
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	
	public Object[] getObj() {
		return items;
	}
	
	public static void display(Iterator<String> i) {
		while(i.hasNext()) {
			String j = i.next();
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> seqa = new ArrayList<String>();
		LinkedList<String> seqll = new LinkedList<String>();
		HashSet<String> seqhs = new HashSet<String>();
		TreeSet<String> seqts = new TreeSet<String>();
		
		for(int i = 0; i < 10; i++) {
			seqa.add(Integer.toString(i));
			seqll.add(Integer.toString(i));
			seqhs.add(Integer.toString(i));
			seqts.add(Integer.toString(i));
		}
		display(seqa.iterator());
		display(seqll.iterator());
		display(seqhs.iterator());
		display(seqts.iterator());
	}

}