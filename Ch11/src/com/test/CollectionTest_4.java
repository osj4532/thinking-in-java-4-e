package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class Generator{
	public void print() {
		System.out.println("gener");
	}
	
	public Collection<String> gener(Collection<String> col) {
		col.add("인셉션");
		col.add("아이언맨");
		col.add("셔터아일랜드");
		col.add("셔터아일랜드");
		
		return col;
	}
	
	public Map<String,String> gener(Map<String,String> col) {
		col.put("1", "인셉션");
		col.put("2", "아이언맨");
		col.put("3", "셔터아일랜드");
		col.put("3", "어벤져스");
		return col;
	}
}

public class CollectionTest_4 {
	public static void main(String[] args) {
		Generator g = new Generator();
		System.out.println(g.gener(new ArrayList<String>()));
		System.out.println(g.gener(new LinkedList<String>()));
		System.out.println(g.gener(new HashSet<String>()));
		System.out.println(g.gener(new LinkedHashSet<String>()));
		System.out.println(g.gener(new TreeSet<String>()));
		System.out.println(g.gener(new HashMap<String,String>()));
		System.out.println(g.gener(new TreeMap<String,String>()));
		System.out.println(g.gener(new LinkedHashMap<String,String>()));
	}
}
