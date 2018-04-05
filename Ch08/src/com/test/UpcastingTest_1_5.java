package com.test;

class Cycle{
	int wheel = 2;
	public void ride(Cycle c) {
		System.out.println("Cycle");
		System.out.println(this.wheels());
	}
	
	public int wheels() {
		return wheel;
	}
}

class Unicycle extends Cycle{
	int wheel = 3;
	@Override
	public void ride(Cycle c) {
		System.out.println("Unicycle");
		System.out.println(this.wheels());
	}
	@Override
	public int wheels() {
		return wheel;
	}
}

class Bicycle extends Cycle{
	int wheel = 4;
	
	@Override
	public void ride(Cycle c) {
		System.out.println("Bicycle");
		System.out.println(this.wheels());
	}
	@Override
	public int wheels() {
		return wheel;
	}
}

class Tricycle extends Cycle{
	int wheel = 5;
	@Override
	public void ride(Cycle c) {
		System.out.println("Tricycle");
		System.out.println(this.wheels());
	}
	@Override
	public int wheels() {
		return wheel;
	}
}


public class UpcastingTest_1_5 {
	//Up casting Test
	public static void ride(Cycle c) {
		c.ride(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();
		
		ride(u);
		ride(b);
		ride(t);
	}

}
