package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// 삼항연산자
		// 반드시 return을 받아주는 변수나 표현식이 필요함!
		int n1 = 100;
		int n2 = 101;
		
		String str = n1 > n2 ? "n1이 더 큽니다" : "n2가 더 큽니다";
		System.out.println(str);
		
		System.out.println(n1 > n2 ? "n2가 더 큽니다" : "n1이 더 큽니다");
	}

}
