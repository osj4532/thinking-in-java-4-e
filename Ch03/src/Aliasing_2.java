
public class Aliasing_2 {

	public float num;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aliasing_2 aliasing1 = new Aliasing_2();
		Aliasing_2 aliasing2 = new Aliasing_2();
		
		aliasing1.num = 2.1f;
		aliasing2.num = 67.3f;
		System.out.println("1:"+aliasing1.num);
		System.out.println("1:"+aliasing2.num);
		
		aliasing1 = aliasing2;
		System.out.println("2:"+aliasing1.num);
		System.out.println("2:"+aliasing2.num);
		
		aliasing1.num = 42.7f;
		System.out.println("3:"+aliasing1.num);
		System.out.println("3:"+aliasing2.num);
	}

}
