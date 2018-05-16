package com.test;

import java.util.Collection;
import java.util.HashSet;

public class SimpleCollection_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c = new HashSet<Integer>();
		for(int i = 0; i < 10; i++) {
			c.add(i);
		}
		for(Integer i : c) {
			System.out.print(i + " ");
		}
	}

}
