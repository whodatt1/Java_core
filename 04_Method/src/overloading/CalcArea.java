package overloading;

public class CalcArea {

	public static void main(String[] args) {
		
		int width = 100;
		double height = 40;
		area(width, height);
		
		int w = 50;
		int h = 40;
		area(w*0.5, h);
		
		double r = 2.5;
		final double PI = 3.14;
		area(r, PI);
	}
	private static void area(double r, double pie, String str) {
		System.out.println("원의 넓이 : " + r * r * pie);
	}
	
	private static void area(double r, double pie) {
		System.out.println("원의 넓이 : " + r * r * pie);
	}

	private static void area(double w, int h) {
		System.out.println("삼각형의 넓이 : " + w * h);
	}

	private static void area(int width, double height) {
		System.out.println("사각형의 넓이 : " + width * height);
	}

}
