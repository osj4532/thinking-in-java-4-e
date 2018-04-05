package com.example;

enum Number{
	ONE,TWO,THREE,FOUR,FIVE
}

public class EnumTest_2122 {

	Number en;
	
	public EnumTest_2122(Number en) {
		this.en = en;
	}
	
	public void description() {
		System.out.print("This number is ");
		switch (en) {
		case ONE: System.out.println("ONE");
			break;
		case TWO: System.out.println("TWO");
			break;
		case THREE: System.out.println("THREE");
			break;
		case FOUR: System.out.println("FOUR");
			break;
		case FIVE: 
		default: System.out.println(".... I don`t know. sorry");
			break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Number i : Number.values()) {
			System.out.print(i);
			System.out.println("ordinal : "+i.ordinal());
		}
		
		EnumTest_2122 et1 = new EnumTest_2122(Number.ONE);
		EnumTest_2122 et2 = new EnumTest_2122(Number.TWO);
		EnumTest_2122 et3 = new EnumTest_2122(Number.FOUR);
		EnumTest_2122 et4 = new EnumTest_2122(Number.FIVE);
		
		et1.description();
		et2.description();
		et3.description();
		et4.description();
	}

}
