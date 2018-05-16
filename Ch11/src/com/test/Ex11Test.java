package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;


public class Ex11Test {

	public static void print(Collection c) {
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,3));
		List<Character> ll = new LinkedList<Character>(Arrays.asList('a','b','c'));
		HashSet<String> hs = new HashSet<String>(Arrays.asList("AA","BB","CC"));
		TreeSet<Integer> ts = new TreeSet<Integer>(Arrays.asList(11,22,33));
		
		print(al);
		print(ll);
		print(hs);
		print(ts);
	}

}
