package com.example;

public class VarargsTest_1920 {

	public void vararges(String... args) {
		for(String var : args) {
			System.out.print(var);
			System.out.println("  length : "+var.length());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarargsTest_1920 test = new VarargsTest_1920();
		test.vararges("hello","world","java","exam");
		test.vararges("wow","lol","030");
	}

}
