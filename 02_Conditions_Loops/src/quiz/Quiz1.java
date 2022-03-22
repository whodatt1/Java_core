package quiz;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// Q1. for문을 활용하여 x의 y승을 구하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("x의 값을 입력하시오 > ");
		int x = sc.nextInt();
		System.out.println("y의 값을 입력하시오 > ");
		int y = sc.nextInt();
		int result = 1;
		
		for (int i = 0; i < y; i++) {
			result *= x;
		}
		
		System.out.println(result);
	}

}
