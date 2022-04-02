package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	String name;
	int age;
	
	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " : " + age;
	}
}

public class SetEx02 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
//		set.add("java");
//		set.add("java");
		
		set.add(new Member("Kim", 29));
		set.add(new Member("Kim", 30));
		set.add(new Member("Kim", 31));
		set.add(new Member("Kim", 32));
		
		System.out.println(set);
		
		for (Member member : set) {
			System.out.println(member.toString());
		}
		
		Iterator<Member> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member);
		}
	}

}
