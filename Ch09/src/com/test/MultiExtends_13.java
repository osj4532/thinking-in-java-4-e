package com.test;

interface Human{
	void eat();
	void sleep();
}

interface Student extends Human{
	void study();
}

interface Worker extends Student{
	void work();
}

class HardWorker implements Worker{
	public void eat() {}
	public void sleep() {}
	public void study() {}
	public void work() {}
}

public class MultiExtends_13 {
	public static void e(Human h) {h.eat();}
	public static void s(Human h) {h.sleep();}
	public static void st(Student s) {s.study();}
	public static void w(Worker w) {w.work();}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HardWorker hw = new HardWorker();
		e(hw);
		s(hw);
		st(hw);
		w(hw);
	}

}
