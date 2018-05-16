package com.test;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ex14Test {

	public static void addMiddle(LinkedList<Integer> l, Integer i) {
		//앞으로 넣기
		//ListIterator<Integer> lt = l.listIterator();
		//뒤로 넣기
		//ListIterator<Integer> lt = l.listIterator(l.size());
		//중간에 넣기
		//ListIterator<Integer> lt = l.listIterator((l.size())/2);
		ListIterator<Integer> lt = l.listIterator((l.size())/2);
		lt.add(i);
		System.out.println(l);
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		addMiddle(li,0);
		addMiddle(li,1);
		addMiddle(li,2);
		addMiddle(li,3);
		addMiddle(li,4);
		
	}
}
