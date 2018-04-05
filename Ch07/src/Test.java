import com.example.ProtectedTest_15;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedTest_15 pro = new ProtectedTest_15();
		//pro.print(); // protected는 패키지가 다르면 private처럼 된다.
	}

}

class SubPro extends ProtectedTest_15{
	public void subPrint() {
		super.print(); //protected는 파생 클래스에서 public처럼 된다.
	}
}
