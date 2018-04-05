public class Incrementable_7 {

	static void increment() {
		StaticTest_7.i++;
	}
	
	public static void main(String[] args) {
		System.out.println(StaticTest_7.i);
		Incrementable_7.increment();
		System.out.println(StaticTest_7.i);
	}
}
