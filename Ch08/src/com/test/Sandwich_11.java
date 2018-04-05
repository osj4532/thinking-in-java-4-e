package com.test;

class Meal{
	Meal(){System.out.println("Meal()");}
}

class Bread{
	Bread(){System.out.println("Bread()");}
}

class Cheese{
	Cheese(){System.out.println("Cheese()");}
}

class Lettuce{
	Lettuce(){System.out.println("Lettuce()");}
}

class Lunch extends Meal{
	Lunch(){System.out.println("Lunch()");}
}

class PortableLunch extends Lunch{
	PortableLunch(){System.out.println("PortableLunch()");}
}

class Pickle{
	Pickle(){
		System.out.println("Pickle()");
	}
}

public class Sandwich_11 extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	public Sandwich_11() {
		System.out.println("Sandwich()");
	}
	private Pickle p = new Pickle();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sandwich_11();
	}

}
