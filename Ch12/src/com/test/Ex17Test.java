package com.test;

class Characteristic{
	private String s;
	Characteristic(String s){
		this.s = s;
		System.out.println("Creating Characteristic " + s);
	}
	protected void dispose() {
		System.out.println("disposing Characteristic " + s);
	}
}

class Description{
	private String s;
	public Description(String s) {
		this.s = s;
		System.out.println("Creating Description " + s);
	}
	protected void dispose() {
		System.out.println("Disposing Description " + s);
	}
}

class LivingCreature {
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Basic Living Creature");
	LivingCreature() {
		System.out.println("LivingCreature()");
	}		
	protected void dispose() {
		System.out.println("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature {
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Animal not Vegetable");
	Animal() { System.out.println("Animal()"); }
	protected void dispose() {
		System.out.println("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");
	Amphibian() { System.out.println("Amphibian()"); }
	protected void dispose() {
		System.out.println("Amphibian dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}
public class Ex17Test extends Amphibian {
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats Bugs");
	public Ex17Test(){
		System.out.println("Ex17Test()");
	}
	public static void jump() {
		System.out.println("jumps");
	}
	protected void dispose() {
		System.out.println("Ex17Test Dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Ex17Test x = new Ex17Test();
		 try {
			 x.jump();
			 System.out.println("finally test after return");
			 return;
		 }finally {
			 
			 x.dispose();
		 }
	}

}
