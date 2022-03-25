package bulit_in;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
//		Date date = new Date();
//		System.out.println(date); // 구버전으로 변환과정이 다소 복잡하여 Deprecated 될 것 같음
		
		System.out.println(today.getDayOfMonth()); // 10
		System.out.println(today.getDayOfYear()); // 314
		System.out.println(today.getMonthValue()); // 11
		System.out.println(today.getYear()); // 2021
		System.out.println(today.getChronology()); // ISO
		System.out.println(today.getDayOfWeek()); // WEDNESDAY
		System.out.println(today.getMonth()); // NOVEMBER
		System.out.println(today.getEra()); // CE
	}

}
