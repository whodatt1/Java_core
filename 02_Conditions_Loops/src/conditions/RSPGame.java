package conditions;

import java.util.Scanner;

public class RSPGame {

	public static void main(String[] args) {
		// 가위바위보 게임을 해보자
		
		// 1. 컴퓨터는 랜덤으로 가위바위보를 선택한다
		// 2. 나도 가위바위보 중에 하나를 입력한다
		// 3. 가위바위보를 비교해서 결과를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 중 선택하여 입력하시오 > ");
		String my = sc.next();
		String com = "";
		int ran = (int) (Math.floor(Math.random()*3)+1);
		if (ran == 1) {
			com = "가위";
		} else if (ran == 2) {
			com = "바위";
		} else {
			com = "보";
		}
		
		if (com.equals("가위")) {
			if (my.equals("가위")) {
				System.out.println("컴퓨터 : " + com + " 나 : " + my + "\n비겼습니다");
			} else if (my.equals("바위")){
				System.out.println("컴퓨터 : " + com + " 나 : " + my + "\n이겼습니다");
			} else {
				System.out.println("컴퓨터 : " + com + " 나 : " + my + "\n졌습니다");
			}
		} else if (com.equals("바위")) {
			if (my.equals("가위")) {
				System.out.println("컴퓨터 : " + com + " 나 : " + my + "\n졌습니다");
			} else if (my.equals("바위")){
				System.out.println("컴퓨터 : " + com + " 나 : " + my + "\n비겼습니다");
			} else {
				System.out.println("컴퓨터 : " + com + " 나 : " + my + "\n이겼습니다");
			}
		} else {
			if (my.equals("가위")) {
				System.out.println("컴퓨터 : " + com + " 나 : " + my + "\n이겼습니다");
			} else if (my.equals("바위")){
				System.out.println("컴퓨터 : " + com + " 나 : " + my + "\n졌습니다");
			} else {
				System.out.println("컴퓨터 : " + com + " 나 : " + my + "\n비겼습니다");
			}
		}
	}

}
