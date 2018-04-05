
public class Dog_56 {

	String name;
	String says;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog_56 dog1 = new Dog_56();
		Dog_56 dog2 = new Dog_56();
		Dog_56 dog3 = new Dog_56();
		
		dog1.name="순돌이";
		dog2.name="악발이";
		dog1.says="멍멍";
		dog2.says="웡웡";
		
		System.out.println(dog1.name+"은 "+dog1.says+" 짖는다.");
		System.out.println(dog2.name+"는 "+dog2.says+" 짖는다.");
		
		dog1 = dog3;
		
		System.out.println(dog1 == dog2);
		System.out.println(dog2 == dog3);
		System.out.println(dog3 == dog1);
		
		System.out.println(dog1.equals(dog2));
		System.out.println(dog2.equals(dog3));
		System.out.println(dog3.equals(dog1));
		
	}

}
