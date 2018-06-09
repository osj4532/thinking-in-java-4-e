package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;

class Annoyance extends RuntimeException{}
class Sneeze extends Annoyance {}

class WrapCheckedException{
	void throwRuntimeException(int type) {
		try {
			switch(type) {
				case 0 : throw new Annoyance();
				case 1 : throw new Sneeze();
				case 2 : throw new RuntimeException("Where am I?");
				default : return;
			}
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}

public class Ex30Test {

	public static void main(String[] args) {
		// 정확한 타입을 catch :
		WrapCheckedException wc = new WrapCheckedException();
		for(int i = 0; i < 3; i++)
			try {
				wc.throwRuntimeException(i);
			}catch(Sneeze e) {
				e.printStackTrace();
			}catch(Annoyance e) {
				e.printStackTrace();
			}catch(RuntimeException e) {
				try {
					e.getCause();
				}catch(Exception re) {
					re.printStackTrace();
				}
				
			}
	}
}