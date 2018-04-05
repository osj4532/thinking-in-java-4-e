
public class DataOnly_456 {

	int i;
	double d;
	boolean b;
	
	int storage(String s) {
		return s.length() * 2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataOnly_456 data = new DataOnly_456();
		
		data.i = 78;
		data.d = 25.68;
		data.b = false;
		
		System.out.println(data.i);
		System.out.println(data.d);
		System.out.println(data.b);
		System.out.println(data.storage("안녕하세요?"));
	}

}
