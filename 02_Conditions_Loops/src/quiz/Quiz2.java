package quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// Q2. 3자리 이상의 정수 L, 정수 a, 정수 b를 입력받아
		//		L까지 a, b의 배수 갯수를 구하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("세자리 정수 L 입력 > ");
		int L = sc.nextInt();
		System.out.println("정수 a 입력 > ");
		int a = sc.nextInt();
		System.out.println("정수 b 입력 > ");
		int b = sc.nextInt();
		
//		int aNum = 0;
//		int aSum = 0;
//		while (aSum <= L) {
//			aSum += a;
//			if (aSum <= L) {
//				aNum++;				
//			}
//		}
//		int bNum = 0;
//		int bSum = 0;
//		while (bSum <= L) {
//			bSum += b;
//			if (bSum <= L) {
//				bNum++;
//			}
//		}
//		System.out.println("정수 a의 배수 갯수는 : " + aNum);
//		System.out.println("정수 b의 배수 갯수는 : " + bNum);
		
		int count = 0;
		
		for (int i = 0; i < L + 1; i++) {
			if (i % a == 0 || i % b == 0) {
				System.out.println(i + " ");
				count++;
			}
		}
		System.out.println("\n" + L + "까지의" + a + "또는" + b + "의 배수 갯수는 " + count + "개 입니다");
	}

}
