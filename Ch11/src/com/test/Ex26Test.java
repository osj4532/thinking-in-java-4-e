package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ex26Test {

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
		//================================================
		//treemap으로 정렬 가능
		Map<Integer,String> re = new TreeMap<Integer,String>();
		Iterator<Map.Entry<String, ArrayList<Integer>>> iter = 
				m.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String, ArrayList<Integer>> me = iter.next();
			for(int i = 0; i < me.getValue().size(); i++) {
				re.put(me.getValue().get(i), me.getKey());
			}
		}
		System.out.println(re.values());
	}

}
