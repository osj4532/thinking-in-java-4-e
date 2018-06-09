package com.test;

class BaseballException extends Exception{}
class Foul extends BaseballException {}
class Strike extends BaseballException {}
class UmpireArgument extends BaseballException{} 
class ThrownFromGame extends UmpireArgument{}

abstract class Inning{
	public Inning() throws BaseballException{}
	public void evnet() throws BaseballException{
		
	}
	public abstract void atBat() throws Strike, Foul, UmpireArgument;
	public void questionableCall() throws UmpireArgument {}
	public void walk() {}
}

class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul {}

interface Storm{
	public void event() throws RainedOut;
	public void rainHard() throws RainedOut;
}



public class Ex20Test extends Inning implements Storm{

	public Ex20Test()
			throws RainedOut, BaseballException, UmpireArgument{}
		
		public Ex20Test(String s) 
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
		public void atBat() throws PopFoul, ThrownFromGame{
			throw new ThrownFromGame();
		}
		public void questionableCall() throws UmpireArgument{
			throw new UmpireArgument();
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				Ex20Test si = new Ex20Test();
				si.atBat();
				si.questionableCall();
			}catch(PopFoul e) {
				System.out.println("Pop foul");
			}catch(UmpireArgument e){
				System.out.println("Umprie argument");
			}catch(RainedOut e) {
				System.out.println("Rained out");
			}catch(BaseballException e) {
				System.out.println("Generic baseball exception");
			}
			try {
				Inning i = new Ex20Test();
				i.atBat();
			}catch(Strike e) {
				System.out.println("Strike");
			}catch(Foul e) {
				System.out.println("Foul");
			}catch(ThrownFromGame e) {
				System.out.println("Throws form game(Inning)");
			}catch(RainedOut e) {
				System.out.println("Rained out");
			}catch(BaseballException e) {
				System.out.println("Generic baseball exception");
			}
		}
}
