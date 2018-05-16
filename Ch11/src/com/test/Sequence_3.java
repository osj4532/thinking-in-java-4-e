package com.test;

import java.util.ArrayList;
import java.util.List;

public class Sequence_3 {
	int i;
	public Sequence_3(int i) {
		this.i = i;
	}
	public String toString() {
		return "Sequence.toString()"+i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Sequence_3> sequence = new ArrayList<Sequence_3>();
		for(int i = 0; i < 10; i++) {
			sequence.add(new Sequence_3(i));
		}
		
		for(Sequence_3 s : sequence) {
			System.out.println(s.toString());
		}
	}

}
