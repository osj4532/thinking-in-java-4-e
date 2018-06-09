package com.test;

class BaseballException1 extends RuntimeException{}
class Foul1 extends BaseballException1 {}
class Strike1 extends BaseballException1 {}

abstract class Inning1{
	public Inning1() throws BaseballException1{}
	public void evnet() throws BaseballException1{
		
	}
	public abstract void atBat() throws Strike1, Foul1;
	public void walk() {}
}

class StormException1 extends RuntimeException{}
class RainedOut1 extends StormException1{}
class PopFoul1 extends Foul1 {}

interface Storm1{
	public void event() throws RainedOut1;
	public void rainHard() throws RainedOut1;
}

public class Ex29Test extends Inning1 implements Storm1{
	//베이스 클래스의 생성자에서 던지지 않는 예외도
	//파생 클래스의 생성자에서는 던질 수 있다.
	//그러나 베이스 클래스의 생성자에서 던져지는 예외는
	//반드시 지정해 주어야 한다.
	public Ex29Test()
		throws RainedOut1, BaseballException1{}
	
	public Ex29Test(String s) 
		throws Foul1, BaseballException1{}
		//베이스 클래스의 메소드에서 던져지지 않은 예외를 
		//파생 클래스의 오버라이딩된 메소드에서 던질 수는 없다.
		//일반 메소드는 베이스 클래스의 것을 따라야 한다.
	// ! void walk() throws PopFoul{} //컴파일 에러
	
		//인터페이스에서는 베이스 클래스의 기존 메소드에 예외를 추가할 수 없다.
	//! public void event() throws RainedOut{}
		//파생 클래스에만 있는 메소드에서는 에외를 추가 해도 좋다.
	public void rainHard() throws RainedOut1{}
	public void event() {}
	public void atBat() throws PopFoul1{}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Ex29Test si = new Ex29Test();
			si.atBat();
		
			Inning1 i = new Ex29Test();
			i.atBat();
		
	}
}
