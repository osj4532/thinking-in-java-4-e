package com.test;

import java.util.ArrayList;
import java.util.List;

class Ex7{
	private static int i;
	private final int j;
	Ex7(){
		i++;
		j = i;
	}
	@Override
	public String toString() {
		return j+"";
	}
}

public class ListTest_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Ex7> list = new ArrayList<Ex7>();
		Ex7[] arr = new Ex7[10];
		for(Ex7 e : arr) {
			e = new Ex7();
			list.add(e);
		}
		List<Ex7> sub = list.subList(3, 7);
		System.out.println(list);
		System.out.println(sub);
		
		list.removeAll(sub);
		System.out.println(list);
	}

}
