package com.test;

interface Rodent1{
	public String print();
}

class Mouse1 implements Rodent1{
	@Override
	public String print() {
		return "[ Mouse1 ]";
	}
}

class Gerbil1 implements Rodent1{
	@Override
	public String print() {
		return "[ Gerbil1 ]";
	}
	
}

class Hamster1 implements Rodent1{
	@Override
	public String print() {
		return "[ Hamster ]";
	}
}

public class InterfaceTest_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent1[] r = {
				new Mouse1(),
				new Gerbil1(),
				new Hamster1()
		};
		
		for(Rodent1 ro : r) {
			System.out.println(ro.print());
		}
	}

}
