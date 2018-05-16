package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ex25Test {

	public static List<String> newList(String s){
		String[] str = s.split(" |\n");
		List<String> word = new ArrayList<String>();
		for(int i = 0; i < str.length; i++) {
			word.add(str[i]);
		}
		return word;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java util List Array Map Collection Test"
				+ "\nSomething iterator Clap Array java Clap";
		String[] s = str.split(" |\n");
		List<String> word = new ArrayList<String>();
		word.addAll(newList(str));
		System.out.println("words :"+ word);
		
		Map<String,ArrayList<Integer>> m = 
				new LinkedHashMap<String,ArrayList<Integer>>();
		Iterator<String> it = word.iterator();
		int count = 0;
		while(it.hasNext()) {
			String ws = it.next();
			count++;
			if(!m.keySet().contains(ws)) {
				ArrayList<Integer> ai = new ArrayList<Integer>();
				ai.add(0,count);
				m.put(ws,ai);
			}else {
				m.get(ws).add(count);
				m.put(ws, m.get(ws));
			}
		}
		
		
		
	}
}
