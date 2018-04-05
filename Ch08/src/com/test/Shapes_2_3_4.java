package com.test;

import java.util.Random;

class Shape{
	public void draw() {}
	public void erase() {}
	public void type() {}
}

class Polygon extends Shape{
	@Override
	public void draw() {
		System.out.println("Polygon.draw()");
	}
	@Override
	public void erase() {
		System.out.println("Polygon.erase()");
	}
	@Override
	public void type() {
		System.out.println("Polygon.type()");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}
	@Override
	public void erase() {
		System.out.println("Circle.erase()");
	}
	@Override
	public void type() {
		System.out.println("Circle.type()");
	}
}

class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("Square.draw()");
	}
	@Override
	public void erase() {
		System.out.println("Square.erase()");
	}
	@Override
	public void type() {
		System.out.println("Square.type()");
	}
}

class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}
	@Override
	public void erase() {
		System.out.println("Triangle.erase()");
	}
	@Override
	public void type() {
		System.out.println("Triangle.type()");
	}
}

class RandomShapeGenerator{
	private Random rand = new Random(3);
	public Shape next() {
		switch(rand.nextInt(4)) {
		default:
		case 0 : return new Circle();
		case 1 : return new Square();
		case 2 : return new Triangle();
		case 3 : return new Polygon();
		}
	}
}

public class Shapes_2_3_4 {
	private static RandomShapeGenerator gen =
			new RandomShapeGenerator();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s = new Shape[9];
		
		for(int i = 0; i < s.length; i++) {
			s[i] = gen.next();
		}
		
		for(Shape shp : s) {
			shp.draw();
			shp.type();
		}
		
	}

}
