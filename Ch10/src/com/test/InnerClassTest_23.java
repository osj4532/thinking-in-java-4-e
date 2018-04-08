package com.test;

interface U {
	void a();

	void b();

	String toString();
}

class A {
	public U getU() {
		return new U() {
			public void a() {
			};

			public void b() {
			};

			public String toString() {
				return "A.getU()";
			};
		};
	}
}

class B {
	U[] u;

	public B(int k) {
		u = new U[k];
	}

	public void saveU(U addU, int i) {
		u[i] = addU;
	}

	public void replaceNull(int i) {
		u[i] = null;
	}

	public void useU() {
		for (U us : u) {
			if (us == null) {
				System.out.println("NULL");
			} else {
				us.a();
				us.b();
				System.out.println(us);
			}
		}
	}
}

public class InnerClassTest_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		B b = new B(3);
		b.saveU(a1.getU(),0);
		b.saveU(a2.getU(),1);
		b.saveU(a3.getU(),2);
		b.useU();
		b.replaceNull(1);
		b.useU();
	}

}
