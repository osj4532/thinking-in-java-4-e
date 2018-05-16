package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MultiIterableClass implements Iterable<String>{
	private String[] word = {"java","banana","be","to","tree","map","loop"};
	
	public Iterator<String> iterator(){
		return new Iterator<String>() {
			private int index = 0;
			public boolean hasNext() {
				return index < word.length;
			}
			public String next() {
				return word[index++];
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public Iterable<String> reversed(){
		return new Iterable<String>() {
			public Iterator<String> iterator(){
				return new Iterator<String>() {
					private int current = word.length -1;
					public boolean hasNext() {
						return current > -1;
					}
					public String next(){
						return word[current--];
					}
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	public Iterable<String> randomized(){
		return new Iterable<String>() {
			public Iterator<String> iterator(){
				List<String> shuffled = 
						new ArrayList<String>(Arrays.asList(word));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiIterableClass mic = new MultiIterableClass();
		for(String s : mic.reversed())
			System.out.print(s + " ");
		System.out.println();
		for(String s : mic.randomized())
			System.out.print(s + " ");
		System.out.println();
		for(String s : mic)
			System.out.print(s + " ");
	}

}
