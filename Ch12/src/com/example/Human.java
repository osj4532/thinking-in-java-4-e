package com.example;

class Annoyance extends Exception{}
class Sneeze extends Annoyance {}

public class Human {

	public static void main(String[] args) {
		// 정확한 타입을 catch :
		try {
			throw new Sneeze();
		}catch(Sneeze e) {
			System.out.println("Caught Sneeze");
		}catch(Annoyance e) {
			System.out.println("Caught Annoyance");
		}
		
		// 베이스 타입을 catch :
		try {
			throw new Sneeze();
		}catch(Annoyance e) {
			System.out.println("Caught Annoyance");
		}
		
	}

}
