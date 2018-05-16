package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ex21Test {
	public static List<String> word(List<String> w, String str){
		String[] s = str.split(" |\n");
		for(int i = 0; i < s.length; i++) {
			w.add(s[i]);
		}
		return w;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java util List Array Map Collection Test"
				+ "\nSomething iterator Clap";
		int totalCount = 0;
		List<String> words = new ArrayList<String>();
		
		word(words, str);
		System.out.println("words to count: " + words);
		Collections.sort(words,String.CASE_INSENSITIVE_ORDER);
		System.out.println("words after sort: " + words);
		
		Map<String, Integer> wordCount = new LinkedHashMap<String,Integer>();
		Iterator<String> iter = words.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			if(words.contains(s)) {
				Integer count = wordCount.get(s);
				wordCount.put(s, count == null ? 1 : count+1);
				totalCount++;
			}
		}
		System.out.println();
		System.out.println("words count: " + wordCount);
		System.out.println();
		System.out.println("Total count:" + totalCount);
		
	}

}
