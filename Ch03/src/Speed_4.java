
public class Speed_4 {
	
	//고정된 거리와 시간으로 속도 구하기
	//고정된 거리는 2km라고 가정
	
	public double speed(int time) {
		return (double)2/time;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speed_4 s = new Speed_4();
		int time = 10;
		System.out.println("2km를"+time+"분 안에 갔다면 속도는 분속"+s.speed(time)+"Km 이다.");
	}

}
