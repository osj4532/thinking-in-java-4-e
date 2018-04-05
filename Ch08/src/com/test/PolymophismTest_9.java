package com.test;

class Rodent{
	@Override
	public String toString() {
		return "[Rodent]";
	}
}

class Mouse extends Rodent{
	@Override
	public String toString() {
		return "[Mouse]";
	}
}

class Gerbil extends Rodent{
	@Override
	public String toString() {
		return "[Gerbil]";
	}
}

class Hamster extends Rodent{
	@Override
	public String toString() {
		return "[Hamster]";
	}
}

public class PolymophismTest_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent[] rodent = {
				new Mouse(),
				new Gerbil(),
				new Hamster()
		};
		for(Rodent r : rodent) {
			System.out.println(r);
		}
	}

}
