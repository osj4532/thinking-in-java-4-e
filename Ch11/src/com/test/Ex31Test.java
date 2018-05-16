package com.test;

import java.util.Iterator;
import java.util.Random;

class Shape{
	public void draw() {}
	public void erase() {}
	public void amend() {System.out.println("Shape.amend()");}
	@Override
	public String toString() {
		return "Shape";
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
	public void amend() {
		System.out.println("Circle.amend()");
	}
	@Override
	public String toString() {
		return "Circle";
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
	public void amend() {
		System.out.println("Square.amend()");
	}
	@Override
	public String toString() {
		return "Square";
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
	public void amend() {
		System.out.println("Triangle.amend()");
	}
	@Override
	public String toString() {
		return "Triangle";
	}
}

class RandomShapeGenerator implements Iterable<Shape> {
	private Shape[] s;
	public RandomShapeGenerator(int num) {
		s = new Shape[num];
		for(int i = 0; i < num; i++) {
			 s[i] = next();
		}
	}
	private Random rand = new Random(3);
	public Shape next() {
		switch(rand.nextInt(3)) {
		default:
		case 0 : return new Circle();
		case 1 : return new Square();
		case 2 : return new Triangle();
		}
	}	
	//이터레이터를 적용해야 포이치 문이 작동한다.
	@Override
	public Iterator<Shape> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Shape>() {
			private int index = 0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < s.length;
			}

			@Override
			public Shape next() {
				// TODO Auto-generated method stub
				return s[index++];
			}
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		};
	}
}
public class Ex31Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomShapeGenerator r = new RandomShapeGenerator(20);
		for(Shape s : r) {
			System.out.println(s);
		}
	}

}
