package com.test;

class Shape{
	Shape(int i){System.out.println("Shape constructor");}
	void dispose() {System.out.println("Shape dispose");}
}

class Circle extends Shape{
	Circle(int i){
		super(i);
		System.out.println("Drawing Circle");
	}
	void dispose() {
		System.out.println("Erasing circle");
		super.dispose();
	}
}

class Triangle extends Shape{
	Triangle(int i){
		super(i);
		System.out.println("Drawing Triangle");
	}
	void dispose() {
		System.out.println("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shape{
	private int start, end;
	Line(int start, int end){
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Drawing Line: " + start +", " + end);
	}
	void dispose() {
		System.out.println("Erasing Line: " + start +", " + end);
		super.dispose();
	}
}
public class Ex16Test  extends Shape{

	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	public Ex16Test(int i) {
		super(i + 1);
		for(int j = 0; j < lines.length; j++)
			lines[j] = new Line(j,j*j);
		c = new Circle(1);
		t = new Triangle(1);
		System.out.println("Combined constructor");
	}
	public void dispose() {
		System.out.println("Ex16Test.dispose");
		t.dispose();
		c.dispose();
		for(int i = lines.length - 1; i >= 0; i--)
			lines[i].dispose();
		super.dispose();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex16Test x = new Ex16Test(47);
		try {
			System.out.println("finally test after return");
			return;
		}finally {
			x.dispose();
		}
	}

}
