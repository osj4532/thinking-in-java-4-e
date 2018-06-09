package com.example;

import java.io.FileInputStream;

public class MainException {
	// 모든 예외를 콘솔로 보낸다.
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//파일을 open한다.
		FileInputStream file =
				new FileInputStream("MainException.java");
		//파일을 사용한다....
		//파일을 close한다:
		file.close();
	}

}
