package quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 24절기 맞추기 게임
		String[] seasonal = {
				"입춘", "우수", "경칩", "춘분", 
				"청명", "곡우", "입하",
				"소만","망종","하지","소서","대서",
				"입추","처서","백로","추분",
				"한로","상강","입동",
				"소설","대설","동지","소한","대한" 
		};
		// ? 번째 절기는 무엇입니까 >
		// 몇 번 시도했는지도 출력
		
		Scanner sc = new Scanner(System.in);
		int ranSeasonal = (int) Math.floor(Math.random()*24);
		System.out.println((ranSeasonal + 1) + "번째 절기는 무엇입니까 > ");
		int tryNum = 0;
		
		while(true) {
			String ans = sc.next();
			tryNum++;
			if (seasonal[ranSeasonal].equals(ans)) {
				System.out.println("정답입니다! 총 시도 횟수는 " + tryNum + "회 입니다");
				break;
			} else {
				System.out.println("오답입니다! 다시 입력해 주세요 > ");
			}
			
		}

	}

}
