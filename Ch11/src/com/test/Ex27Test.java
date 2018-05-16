package com.test;

import java.util.LinkedList;
import java.util.Queue;

class Command{
	String str;
	public Command(String str) {
		this.str = str;
	}
	public void operation() {
		System.out.println(str);
	}
}

public class Ex27Test {

	public static Queue<Command> com(Queue<Command> q, Command c) {
		q.offer(c);
		return q;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Command> q = new LinkedList<Command>();
		com(q,new Command("A"));
		com(q,new Command("B"));
		com(q,new Command("C"));
		com(q,new Command("D"));
		com(q,new Command("E"));
		while(q.peek() != null) {
			q.remove().operation();
		}
	}

}
