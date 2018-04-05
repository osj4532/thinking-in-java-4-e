package com.test;

interface Monster {
	void attack();

	void move();
}

interface Animal {
	void threat();

	void alert();
}

interface Ghost {
	void fly();

	void curse();
}

interface Unknown extends Monster, Animal, Ghost {
	public void roar();
}

abstract class Notice {
	public abstract void notice();
}

class Demon extends Notice implements Unknown {
	@Override
	public void notice() {}
	
	@Override
	public void attack() {}

	@Override
	public void move() {}

	@Override
	public void threat() {}

	@Override
	public void alert() {}

	@Override
	public void fly() {}

	@Override
	public void curse() {}

	@Override
	public void roar() {}
}

public class MultiExtends_14_15 {
	public static void m1(Monster m) {m.attack();}
	public static void m2(Animal a) {a.alert();}
	public static void m3(Ghost g) {g.curse();}
	public static void m4(Unknown u) {u.roar();}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demon d = new Demon();
		m1(d);
		m2(d);
		m3(d);
		m4(d);
		
		
	}

}
