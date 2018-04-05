
public class Fibonacci_9 {
	// 1 1 2 3 5
	public void fibo(int num) {
		int num1 = 1;
		int num2 = 1;
		int result = num1 + num2;
		
		System.out.println("1");
		System.out.println("1");
		
		for(int i=2; i<num;i++) {
			result = num1 + num2;
			System.out.println(result);
			if(i%2==0)
				num1 = result;
			if(i%2==1)
				num2 = result;
			
		}
		
	}
}
