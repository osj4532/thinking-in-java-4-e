package com.test;

class Cycle1{
	int wheel = 2;
	public void ride(Cycle c) {
		System.out.println("Cycle");
		System.out.println(this.wheels());
	}
	
	public int wheels() {
		return wheel;
	}
	
	public void balance() {
		System.out.println("2");
	}
}

class Unicycle1 extends Cycle1{
	int wheel = 3;
	public void ride(Cycle c) {
		System.out.println("Unicycle");
		System.out.println(this.wheels());
	}
	
	public int wheels() {
		return wheel;
	}
	
	public void balance() {
		System.out.println("3");
	}
}

class Bicycle1 extends Cycle1{
	int wheel = 4;
	public void ride(Cycle c) {
		System.out.println("Bicycle");
		System.out.println(this.wheels());
	}
	
	public int wheels() {
		return wheel;
	}
	
	public void balance() {
		System.out.println("4");
	}
}

class Tricycle1 extends Cycle1{
	int wheel = 5;
	public void ride(Cycle c) {
		System.out.println("Tricycle");
		System.out.println(this.wheels());
	}
	
	public int wheels() {
		return wheel;
	}
}

public class DowncastTest_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle1[] cycles = {
				new Unicycle1(),
				new Bicycle1(),
				new Tricycle1()
		};
		
		for(Cycle1 c : cycles) {
			c.balance();
		}
		
		((Unicycle1)cycles[0]).balance();
		((Bicycle1)cycles[1]).balance();
		((Tricycle1)cycles[2]).balance();
	}

}
