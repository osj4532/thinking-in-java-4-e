import java.util.Random;

public class Coin_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int coin = rand.nextInt(2);
		
		System.out.println(coin);
		if(coin == 0) {
			System.out.println("앞면입니다.");
		}else {
			System.out.println("뒷면입니다.");
		}
	}

}
