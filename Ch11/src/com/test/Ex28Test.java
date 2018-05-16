package com.test;

import java.util.PriorityQueue;
import java.util.Random;

public class Ex28Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		Random rand = new Random(47);
		
		for(int i = 0 ; i < 10; i++) {
			double d = rand.nextDouble();
			pq.offer(d);
		}
		
		for(int i = 0 ; i < 10; i++) {
			System.out.println(pq.poll());
		}
		
	}

}
