package com.test;

public class Ex5Test {
	private static int[] arr = new int[4];
	static int x = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try {
				arr[x] = 1;
				System.out.println(arr[x]);
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Caught ArrayIndexOutOfBoundsException");
				e.printStackTrace();
				x--;
			} finally {
				System.out.println("Are we done yet?");
			}
		}
		System.out.println("Now, we`re done");
	}

}
