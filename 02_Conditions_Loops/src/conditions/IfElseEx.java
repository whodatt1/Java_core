package conditions;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 몇시니?");
		int nowHour = sc.nextInt();

		if (nowHour < 9) {
			System.out.println("굿 모닝");
		} else {
			System.out.println("일어나야지??");
			if (nowHour < 13) {
				System.out.println("굿 애프터눈");
			} else {
				System.out.println("신호 보내셔야죠~");
			}
		}
		// if > else if > else

		System.out.println("백신 맞았니? > y, n, w");
		String ans = sc.next();

		if (ans.equals("y")) {
			System.out.println("잘하셨습니다");
		} else if (ans.equals("n")) {
			System.out.println("맞기를 권고합니다");
		} else {
			System.out.println("좋은 생각입니다");
		}
	}

}
