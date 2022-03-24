package creation;

public class Quiz {

	public static void main(String[] args) {
		// 랜덤으로 정수를 5개를 배열로 만들어
		// 그 배열을 매서드에 전달하면
		// 평균을 연산 후 리턴 받아
		// 출력하는 코드를 작성하세요
		// 1. 랜덤으로 정수 5개 만드는 메서드
		// 2. 평균을 연산하는 메서드
		
		int[] ints = makeRandom();
		double result = getAvg(ints);
		System.out.println(result);
	}

	private static double getAvg(int[] ints) {
		int sum = 0;
		for (int i : ints) {
			sum += i;
		}
		double avg = (double) sum / 5;
		return avg;
	}

	private static int[] makeRandom() {
		int[] ints = new int[5];
		for (int i = 0; i < 5; i++) {
			ints[i] = (int) (Math.floor(Math.random()*100)) +1;
		}
		return ints;
	}

}
