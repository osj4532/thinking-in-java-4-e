package com.example;

class BaseballException extends Exception{}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning{
	public Inning() throws BaseballException{}
	public void evnet() throws BaseballException{
		
	}
	public abstract void atBat() throws Strike, Foul;
	public void walk() {}
}

class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul {}

interface Storm{
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}

public class StromyInning extends Inning implements Storm{
	//베이스 클래스의 생성자에서 던지지 않는 예외도
	//파생 클래스의 생성자에서는 던질 수 있다.
	//그러나 베이스 클래스의 생성자에서 던져지는 예외는
	//반드시 지정해 주어야 한다.
	public StromyInning()
		throws RainedOut, BaseballException{}
	
	public StromyInning(String s) 
		throws Foul, BaseballException{}
		//베이스 클래스의 메소드에서 던져지지 않은 예외를 
		//파생 클래스의 오버라이딩된 메소드에서 던질 수는 없다.
		//일반 메소드는 베이스 클래스의 것을 따라야 한다.
	// ! void walk() throws PopFoul{} //컴파일 에러
	
		//인터페이스에서는 베이스 클래스의 기존 메소드에 예외를 추가할 수 없다.
	//! public void event() throws RainedOut{}
		//파생 클래스에만 있는 메소드에서는 에외를 추가 해도 좋다.
	public void rainHard() throws RainedOut{}
	public void event() {}
	public void atBat() throws PopFoul{}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			StromyInning si = new StromyInning();
			si.atBat();
		}catch(PopFoul e) {
			System.out.println("Pop foul");
		}catch(RainedOut e) {
			System.out.println("Rained out");
		}catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		try {
			Inning i = new StromyInning();
			i.atBat();
		}catch(Strike e) {
			System.out.println("Strike");
		}catch(Foul e) {
			System.out.println("Foul");
		}catch(RainedOut e) {
			System.out.println("Rained out");
		}catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
	}

}
