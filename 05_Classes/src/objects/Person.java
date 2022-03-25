package objects;

class Pet {
	String nickName="냥이";
	boolean gender=false;
	int age=2;
	char kind='A';
	
	
	void move() {
		System.out.println("걷기 시작했어");
	}
	
	void sound() {
		System.out.println("야옹");
	}
	
	void getOld() {
		age++;
	}
}

public class Person {

	public static void main(String[] args) {
		Pet myCat = new Pet();
//		String myCatNick = myCat.nickName; // "냥이"
//		System.out.println(myCatNick);
		System.out.println(myCat.nickName);
		myCat.nickName = "냥냥이";
		System.out.println(myCat.nickName);
		
		System.out.println(myCat.age);
		myCat.getOld();
		System.out.println(myCat.age);
		
	}

}

// 은행을 이용하는 사람 입금과 출금 나는 사람 내가 갖고있어야하는것 은행계좌 class bankaccount 속성 