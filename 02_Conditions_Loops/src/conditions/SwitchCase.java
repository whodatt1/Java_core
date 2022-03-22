package conditions;

public class SwitchCase {

	public static void main(String[] args) {
		// 비교연산 => 정확하게 일치하는 값이 필요함
		String str = "Spring";
		
		switch (str) {
		case "Spring":
			System.out.println("봄이 왔어요");
			break;
		case "Summer":
			System.out.println("여름이 왔어요");
			break;
		case "Fall":
			System.out.println("가을이 왔어요");
			break;
		case "Winter":
			System.out.println("겨울이 왔어요");
			break;

		default:
			System.out.println("Flex");
			break;
		}
	}

}
