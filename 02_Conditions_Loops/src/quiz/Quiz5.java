package quiz;

public class Quiz5 {

	public static void main(String[] args) {
		// Q5. (Optional)
		//		다음과 같이 출력되도록 하세요
		// 		ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// 		ABCDEFGHIJKLMNOPQRSTUVWXY
		// 		ABCDEFGHIJKLMNOPQRSTUVWX
		// 		ABCDEFGHIJKLMNOPQRSTUVW
		// 		ABCDEFGHIJKLMNOPQRSTUV
		// 		ABCDEFGHIJKLMNOPQRSTU
		// 		ABCDEFGHIJKLMNOPQRST
		// 		ABCDEFGHIJKLMNOPQRS
		// 		ABCDEFGHIJKLMNOPQR
		// 		ABCDEFGHIJKLMNOPQ
		//		.....
		//		....
		// 		...
		//		A

		for (int i = 0; i < 26; i++) {
			char a = 'A';
			for (int j = 0; j < 26 - i; j++) {
				System.out.print((char) (a + j));
			}
			System.out.println();
		}
	}

}
