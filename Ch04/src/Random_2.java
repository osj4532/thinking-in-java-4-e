import java.util.Random;

public class Random_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
	
		int j = 0,k = 0;
		
		for(int i=0; i<25; i++) {
			
				k = j;
			
			j = rand.nextInt(100)+1;
			System.out.println(i+1+"번째:"+j);
			if(i != 0) {
				if(k < j) {
					System.out.println(k+"보다 "+j+"가 더크다.");
				}else if(k == j) {
					System.out.println(k+"와 "+j+"는 같다.");
				}else {
					System.out.println(k+"는 "+j+"보다 크다.");
				}
			}
		}
	}

}
