package generics;

import java.util.HashMap;
import java.util.Map;

public class FreshStore {

	public static void main(String[] args) {
		Map<String, Box<Fruit>> map = new HashMap<>();
		map.put("AppleBox", new Box<Fruit>());
		map.put("OrangeBox", new Box<Fruit>());
		
		
	}

}
