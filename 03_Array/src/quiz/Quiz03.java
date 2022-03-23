package quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 숫자 야구 게임
		int[] start = new int[3];
		int[] answer = new int[3];
		
		boolean flag = false;
		for (int i = 0; i < 3; i++) {
			flag = true;
			while(flag) {
				 int ranNum = (int) (Math.random() * 9) + 1;
				 flag = false;
				 
				 for (int j = 0; j < i; j++) {
					if (start[j] == ranNum) {
						flag = true;
						break;
					}	
				}
				start[i] = ranNum;
			}
		}
		System.out.println("랜덤한 숫자 생성이 완료되었습니다.");
		
		for (int i : start) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			int strike = 0;
			int ball = 0;
			System.out.println("세자리 정수를 입력하세요 >");
			int input = sc.nextInt();
			
			answer[0] = input / 100;
			answer[1] = (input % 100) / 10;
			answer[2] = input % 10;
			
			for (int i = 0; i < start.length; i++) {
				for (int j = 0; j < answer.length; j++) {
					if (i == j) {
						if (start[i] == answer[j]) {
							strike++;
						}
					} else if (i != j){
						if (start[i] == answer[j]) {
							ball++;
						}
					}
				}
			}
			if (strike == 3) {
				for (int i : answer) {
					System.out.print(i + " ");
				}
				System.out.println(strike + "S 정답입니다!");
				break;
			} else {
				for (int i : answer) {
					System.out.print(i + " ");
				}
				System.out.print(strike + "S " + ball + "B\n");	
			}
		}
	}

}
