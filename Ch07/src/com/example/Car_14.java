package com.example;

class Engine{
	public void start() {}
	public void rev() {}
	public void stop() {}
	public void service() {}
}

class Wheel{
	public void inflate(int psi) {}
}

class Window{
	public void rollup() {}
	public void rolldown() {}
}

class Door {
	public Window window = new Window();
	public void open() {}
	public void close() {}
}

public class Car_14 {

	public Engine engin = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door(), right = new Door();
	
	public Car_14() {
		for(int i = 0; i< 4; i++) {
			wheel[i] = new Wheel();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_14 car = new Car_14();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		car.engin.service();
	}

}
