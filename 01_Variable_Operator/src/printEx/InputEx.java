package printEx;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력 객체를 생성
		
		System.out.println("무엇이든 입력하세요"); // 입력 아내문
		String str = sc.next(); // 입력 객체 안의 입력값을 가져오는 메서드 => 변수에 저장
		System.out.println("입력결과 :" + str); // 변수에 저장된 결과 출력
	}
}
