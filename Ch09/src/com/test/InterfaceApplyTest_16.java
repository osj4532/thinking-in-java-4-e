package com.test;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class CreateWord{

	private static Random rand = new Random();
	public char next() {
		return (char)rand.nextInt(128);
	}
}
public class InterfaceApplyTest_16 extends CreateWord implements Readable{
	private int count;
	public InterfaceApplyTest_16(int count) {
		this.count = count;
	}
	public int read(CharBuffer cb) {
		if(count-- == 0) return -1;
		String result = Character.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(new InterfaceApplyTest_16(10));
		while(s.hasNext()) {
			System.out.println(s.next()+" ");
		}
	}

}
