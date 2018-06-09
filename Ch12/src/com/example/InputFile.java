package com.example;

import java.io.*;

public class InputFile {
	private BufferedReader in;
	public InputFile(String fname) throws Exception{
		try {
			in = new BufferedReader(new FileReader(fname));
		}catch(FileNotFoundException e) {
			System.out.println("Could not open " + fname);
			throw e;
		}catch(Exception e) {
			//모든 다른 예외에서는 파일을 close해야 한다.
			try {
				in.close();
			}catch(IOException e2) {
				System.out.println("in.close() unsuccessful");
			}
			throw e;
		}finally {
			//여기서 파일을 close하면 안된다.
		}
	}
	public String getLine() {
		String s;
		try {
			s = in.readLine();
		}catch(IOException e) {
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}
	public void dispose() {
		try {
			in.close();
			System.out.println("dispose() successful");
		}catch(IOException e2) {
			throw new RuntimeException("in.close() failed");
		}
	}
}
