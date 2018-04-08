package com.test;

import com.test.OutClass1.InClass1;
import com.test.OutClass1.InClass1.InClass2;

class OutClass1{
	public void print() {
		System.out.println("OutClass1");
	}
	
	public static class InClass1{
		public void print() {
			System.out.println("InClass1");
		}
		
		public static class InClass2{
			public void print() {
				System.out.println("InClass2");
			}
		}
	}
}

public class InnerClassTest_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass1 out = new OutClass1();
		out.print();
		InClass1 in1 = new InClass1();
		in1.print();
		InClass2 in2 = new InClass2();
		in2.print();
		
		//OutClass1.class
		//OutClass1$InClass1.class
		//OutClass1$InClass1$InClass2.class
	}

}
