package com.example;
class NeedsCleanup{ // Construction can`t fail
	private static long counter = 1;
	private final long id = counter++;
	public void dispose() {
		System.out.println("NeedsCleanup " + id + "disposed");
	}
}
class ConstructionException extends Exception{}

class NeedsCleanup2 extends NeedsCleanup{
	//객체 생성 실패 :
	public NeedsCleanup2() throws ConstructionException{}
}
public class CleanupIdiom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 구역 : 
		NeedsCleanup nc1 = new NeedsCleanup();
		try {
			// ...
		}finally {
			nc1.dispose();
		}
		
		// 2 구역 :
		NeedsCleanup nc2 = new NeedsCleanup();
		NeedsCleanup nc3 = new NeedsCleanup();
		try {
			// ...
		}finally {
			nc3.dispose();	//Reverse order of constrution
			nc2.dispose();
		}
		
		// 3 구역 :
		// 만일 객체 생성에 실패 할 수 있다면,
		// 각 객체의 생성마다 try 블록을 사용해야 한다:
		try {
			NeedsCleanup2 nc4 = new NeedsCleanup2();
			try {
				NeedsCleanup2 nc5 = new NeedsCleanup2();
				try {
					// ...
				}finally {
					nc5.dispose();
				}
			}catch(ConstructionException e) {
				System.out.println(e);
			}finally {
				nc4.dispose();
			}
		}catch(ConstructionException e) {
			System.out.println(e);
		}
	}

}
