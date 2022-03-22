package quiz;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// Q3. 음수나 0을 입력할때까지 숫자를 계속 입력받고
		// 		음수나 0이 입력되면 지금까지 입력된 수의 총합과 평균을 구하세요
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요 > ");
			
			int sum = 0;
			int i = 0;
		
			while(true) {
				int num = sc.nextInt();
				if (num <= 0) {
					System.out.println("지금까지 입력된 수의 합 : " + sum + "\n평균값 : " + ((double)sum/i));
					break;
				} else {
					i++;
					sum += num;	
				}
			}
		
		}
}
