package com.test;

interface Cycle{
	void ride();
}

interface CycleFactory{
	Cycle getRide();
}

class Unicycle implements Cycle{
	@Override
	public void ride() {
		System.out.println("Unicylce");
	}
}

class UnicycleFactory implements CycleFactory{
	@Override
	public Cycle getRide() {
		return new Unicycle();
	}
}

class Bicycle implements Cycle{
	@Override
	public void ride() {
		System.out.println("Bicycle");
	}
}

class BicycleFactory implements CycleFactory{
	@Override
	public Cycle getRide() {
		return new Bicycle();
	}
}

class Tricycle implements Cycle{
	@Override
	public void ride() {
		System.out.println("Tricycle");
	}
}

class TricycleFactory implements CycleFactory{
	@Override
	public Cycle getRide() {
		return new Tricycle();
	}
}

public class FactoryTest_18 {
	public static void rideCycle(CycleFactory cf) {
		Cycle c = cf.getRide();
		c.ride();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rideCycle(new UnicycleFactory());
		rideCycle(new BicycleFactory());
		rideCycle(new TricycleFactory());
	}

}
