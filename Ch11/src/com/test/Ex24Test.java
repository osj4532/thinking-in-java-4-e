package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Ex24Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		m.put("one", 1);
		m.put("five", 5);
		m.put("three", 3);
		m.put("two", 2);
		m.put("four", 4);
		System.out.println(m);
		
		List<String> s = new ArrayList<String>(m.keySet());
		Collections.sort(s,String.CASE_INSENSITIVE_ORDER);
		Iterator<String> it = s.iterator();
		Map<String, Integer> sm = new LinkedHashMap<String, Integer>();
		while(it.hasNext()) {
			String str = it.next();
			sm.put(str,m.get(str));
		}
		System.out.println(sm);
		
	}

}
