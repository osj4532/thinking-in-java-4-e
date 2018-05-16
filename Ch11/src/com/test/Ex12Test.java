package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Ex12Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		List<Integer> revlist = new ArrayList<Integer>();
		ListIterator<Integer> lt = list.listIterator();
		ListIterator<Integer> rlt = revlist.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next()+", "+lt.nextIndex()+", "+lt.previousIndex());
		}
		
		while(lt.hasPrevious()) {
			revlist.add(lt.previous());
		}
		
		for(Integer r : revlist) {
			System.out.println(r);
		}
		
	}

}
