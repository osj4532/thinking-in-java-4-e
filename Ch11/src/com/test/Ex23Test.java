package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Ex23Test {

	public static int getBestInt() {
		Random rand = new Random();
		Map<Integer, Integer> m = new HashMap<Integer,Integer>();
		for(int i = 0; i < 10000; i++) {
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq+1);
		}
		int max = 0;
		for(int i = 0; i < m.size(); i++) {
			max = max < m.get(i) ? m.get(i) : max;
		}
		
		Set<Map.Entry<Integer, Integer>>me = new LinkedHashSet<Map.Entry<Integer,Integer>>(m.entrySet());
		Iterator<Map.Entry<Integer, Integer>> it = me.iterator();
		int maxkey = 0;
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> findmax = it.next();
			if(findmax.getValue() == max) 
				maxkey = findmax.getKey();
		}
		return maxkey;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> m = 
				new TreeMap<Integer, Integer>();
		for(int i = 0; i < 2000; i++) {
			int x = getBestInt();
			Integer freq = m.get(x);
			m.put(x, freq == null ? 1 : freq + 1);
		}
		
		System.out.println("Most of ten picked ints, 0 - 19, in 2000 tests of picks :\n" + m);
		
		
		}

}
