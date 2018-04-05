package com.test;

import com.interfacetest.Shape;

class Circle implements Shape{
	@Override
	public void type() {
		System.out.println("Circle");
	}
	@Override
	public void color() {
		System.out.println("Red");
	}
	@Override
	public void print() {
		System.out.println("Circle : Hello");
	}
	
}

public class InterfaceTest_5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.color();
		c.type();
		c.print();
	}

}
