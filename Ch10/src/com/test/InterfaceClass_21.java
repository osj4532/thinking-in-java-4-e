package com.test;

interface Test4{
	String f();
	class InTest4{
		static void f(Test4 t) {
			System.out.println(t.f());
		}
	}
}

public class InterfaceClass_21 implements Test4{

	public String f() {
		return "Test4.f()";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass_21 x = new InterfaceClass_21();
		Test4.InTest4.f(x);
	}

}
