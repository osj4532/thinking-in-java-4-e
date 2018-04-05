package com.test;

class Rodent1{
	public static int refcount;
	Rodent1(){
		System.out.println("Rodent()");
		refcount++;
	}
	public void dispose() {
		--refcount;
		System.out.println("Rodent1().despose");
	}
}

class Mouse1 extends Rodent1{
	Mouse1(){
		System.out.println("Mouse()");
	}
	@Override
	public void dispose() {
		System.out.println("Mouse1().despose");
		super.dispose();
	}
}

class Gerbil1 extends Mouse1{
	Gerbil1(){
		System.out.println("Gerbil()");
	}
	@Override
	public void dispose() {
		System.out.println("Gerbil1().despose");
		super.dispose();
	}
}

class Hamster1 extends Gerbil1{
	Hamster1(){
		System.out.println("Hamster()");
	}
	@Override
	public void dispose() {
		System.out.println("Hamster1().despose");
		super.dispose();
	}
}
public class CleanupTest_12_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hamster1().dispose();
		System.out.println(new Mouse1().refcount);
		System.out.println(new Mouse1().refcount);
	}

}
