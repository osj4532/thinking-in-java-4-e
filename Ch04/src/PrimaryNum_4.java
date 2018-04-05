
public class PrimaryNum_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag;
		
		for(int i = 1; i<=50; i++) {
			flag = true;
			for(int j = 1; j < i; j ++) {
				if(j!=1 && i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.println(i);
			}
		}
	}

}
