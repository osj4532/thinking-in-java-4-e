package com.example;

class Shape{
	public Shape() {
		System.out.println("shape");
	}
}

class Rectangle extends Shape{
	public Rectangle() {
		System.out.println("rectangle");
	}
}

class Cube extends Rectangle{
	public Cube() {
		System.out.println("cube");
	}
}


public class ExtendTest_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube = new Cube();
	}

}
