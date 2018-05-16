package com.test;

import java.util.LinkedList;

class Stack<T>{
	private LinkedList<T> ll = new LinkedList<T>();
	public  void push(T v) {
		ll.addFirst(v);
	}
	public T peek() {
		return ll.getFirst();
	}
	public T pop() {
		return ll.removeFirst();
	}
	public boolean isEmpty() {
		return ll.isEmpty();
	}
	public String toString() {
		return ll.toString();
	}
}

public class Ex15Test {

	public static void process(Stack<Character> s, String str) {
		char[] ch = str.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == '+') {
				i++;
				s.push(ch[i]);
			}else if(ch[i] == '-') {
				System.out.print(s.pop());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> s = new Stack<Character>();
		String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
		process(s,str);
	}

}
