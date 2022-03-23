package arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] intArr = new int[12];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.floor(Math.random()*100)) + 1;
			
			System.out.print(intArr[i] + " ");
		}
		System.out.println("\n==============================================");
		intArr[0] = 101;
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		System.out.println("\n=========================순차정렬=====================");
		// 순차정렬과 역정렬을 구현해보세요
		
		
		for (int i = 0; i < intArr.length -1; i++) {
			for (int j = 0; j < intArr.length -1 -i; j++) {
				if (intArr[j] > intArr[j + 1]) {
					int bubble = intArr[j];
					intArr[j] = intArr[j + 1];
					intArr[j + 1] = bubble;
				}
			}
		}
		for (int i: intArr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n=======================역정렬=======================");
		for (int i = 0; i < intArr.length -1; i++) {
			for (int j = 0; j < intArr.length -1 -i; j++) {
				if (intArr[j] < intArr[j + 1]) {
					int bubble = intArr[j];
					intArr[j] = intArr[j + 1];
					intArr[j + 1] = bubble;
				}
			}
		}
		for (int i: intArr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n==============================================");
		
	}

}
