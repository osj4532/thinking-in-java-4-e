package com.test;

class People{
	void type() {
		System.out.println("");
	}
}

class GoodPeople extends People{
	@Override
	void type() {
		System.out.println("Inocent!");
	}
}

class BadPeople extends People{
	@Override
	void type() {
		System.out.println("Illigel!");
	}
}

public class Transmogrify_16 {
	private People p = new GoodPeople();
	
	public void whatType() {
		p.type();
	}
	
	public void change() {
		p = new BadPeople();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transmogrify_16 t = new Transmogrify_16();
		t.whatType();
		t.change();
		t.whatType();
	}

}
