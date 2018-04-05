package com.test;

abstract class Rodent{
	public abstract String toString();
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

public class AbstractTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent[] r = {
				new Mouse(),
				new Gerbil(),
				new Hamster()
		};
		
		for(Rodent ro : r) {
			System.out.println(ro.toString());
		}
	}

}
