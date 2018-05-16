package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Word{
	static int totalCount = 0;
	int count;
	String s;
	public Word(String s, int count) {
		this.s = s;
		this.count = count;
		totalCount++;
	}
	@Override
	public String toString() {
		return "["+s+": " + count+"]";
	}
	@Override
	public int hashCode() {
		return (count+s).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Word) {
			Word tep = (Word)obj;
			return s.equals(tep.s) && count == tep.count;
		}
		return false;
	}
}


public class Ex22Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java util List Array Map Collection Test"
				+ "\nSomething iterator Clap Array Clap";
		String[] s = str.split(" |\n");
		List<String> word = new ArrayList<String>();
		for(int i = 0; i < s.length; i++) {
			word.add(s[i]);
		}
		Collections.sort(word,String.CASE_INSENSITIVE_ORDER);
		System.out.println("word after sort: " +word);
		
		Set<Word> set = new HashSet<Word>();
		Iterator<String> iter = word.iterator();
		while(iter.hasNext()) {
			String ws = iter.next();
			int count = 0;
			for(int i = 0; i < word.size(); i++) {
				if(ws.equals(word.get(i))) count++;
			}
			Word w = new Word(ws,count);
			set.add(w);
		}
		for(int i = 0; i < set.size(); i++) {
			
		}
		System.out.println("Word count:" + set);
		System.out.println("Total count: " + Word.totalCount);
	}
}
