package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		Set set = new HashSet();
		int count = 0;
		for (int i = 0; set.size() < 10; i++) {
			int num = (int) (Math.random() * 10) + 1;
			count++;
			set.add(num);
		}
		System.out.println(count);
		System.out.println(set);

		List list = new LinkedList(set);
		Collections.sort(list);

		System.out.println(list);

//		for (int i = 0; i < 10; i++) {
//			System.out.println(set);
//		}
	}

}
