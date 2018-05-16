package com.test;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Ex20Test {

	public static void countVowel(Set<String> s ) {
		int tcount = 0;
		Set<Character> vowels = new TreeSet<Character>();
		Collections.addAll(vowels, 'A','E','I','O','U','a','e','i','o','u');
		
		for(String str : s) {
			for(Character c : str.toCharArray()) {
				if(vowels.contains(c)) {

					tcount++;
				}
			}
			System.out.println(str+"까지의 총 모음 갯수는" + tcount);
		}
		System.out.println("전체 모음 갯수는" + tcount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> words = new TreeSet<String>();
		String[] str = {"Output","class","Set","net","void","Collections","addAll","holding","false","import","args","main","Print","static","removeAll","util","String","A","X","K","L","M","H","B","C","H"}; 
		Collections.addAll(words,str);
		countVowel(words);
	
	}


}
