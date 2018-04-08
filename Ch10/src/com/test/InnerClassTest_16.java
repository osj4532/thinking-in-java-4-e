package com.test;

interface Cycle {
	void ride();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {
	public void ride() { System.out.println("Ride Unicycle"); }
	public static CycleFactory getFactory() {
		return new CycleFactory() {
			public Cycle getCycle() {
				return new Unicycle();
			}
		};
	}
}
class Bicycle implements Cycle {
	public void ride() { System.out.println("Ride Bicycle"); }
	public static CycleFactory getFactory() {
		return new CycleFactory() {
			public Cycle getCycle() {
				return new Bicycle();
			}
		};
	}
}

class Tricycle implements Cycle {
	public void ride() { System.out.println("Ride Tricycle"); }
	public static CycleFactory getFactory() {
		return new CycleFactory() {
			public Cycle getCycle() {
				return new Tricycle();
			}
		};
	}
}

public class InnerClassTest_16 {
	public static void factory(CycleFactory cf) {
		Cycle c = cf.getCycle();
		c.ride();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory(Unicycle.getFactory());
		factory(Bicycle.getFactory());
		factory(Tricycle.getFactory());
	}

}
