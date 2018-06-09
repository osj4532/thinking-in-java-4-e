package com.test;

class FirstException extends Exception{}
class SecondException extends FirstException{}
class ThirdException extends SecondException{}

class AClass{
	public void thrown() throws FirstException {
		throw new FirstException();
	}
}
class BClass extends AClass{
	@Override
	public void thrown() throws SecondException{
		throw new SecondException();
	}
}
class CClass extends BClass{
	@Override
	public void thrown() throws ThirdException{
		throw new ThirdException();
	}
}
public class Ex25Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AClass test = new CClass();
		try{
			test.thrown();
		}catch(ThirdException e) {
			System.out.println("ThirdException");
			e.printStackTrace();
		}catch(SecondException e) {
			System.out.println("SecondException");
			e.printStackTrace();
		}catch(FirstException e) {
			System.out.println("FirstException");
			e.printStackTrace();
		}
	}

}
