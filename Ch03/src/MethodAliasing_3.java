class Letter{
	
	public float num;
}

public class MethodAliasing_3 {
	
	static void f(Letter y) {
		y.num = 13.2f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter x = new Letter();
		x.num = 45.6f;
		System.out.println("1: x.num: "+x.num);
		f(x);
		
		System.out.println("2: x.num: "+x.num);
	}

}
