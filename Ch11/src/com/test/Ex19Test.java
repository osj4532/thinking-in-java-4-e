package com.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Ex19Test {

	public static void main(String[] args) {
		Map<String, String>m = new HashMap<String, String>();
		m.put("F", "Five");
		m.put("T", "Three");
		m.put("S", "Seven");
		m.put("O", "One");
		System.out.println(m);
		
		Set<String> sort = new TreeSet<String>();
		
		for(String str : m.keySet()) {
			sort.add(str);
		}
		System.out.println(sort);
		
		Map<String, String>lm = new LinkedHashMap<String, String>();
		for(String i : sort) {
			lm.put(i, m.get(i));
		}
		System.out.println(lm);
	}

}
