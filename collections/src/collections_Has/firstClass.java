package collections_Has;

import java.util.HashMap;
import java.util.Map;

public class firstClass {
	public static void main(String[] args) {
		HashMap<Integer, String> hash = new HashMap<>();
		
		hash.put(1,"Kshitij");
		hash.put(2,"Raj");
		hash.put(3,"Ankit");
		hash.put(4,"Prabhu");
		
		
		System.out.println(hash.get(1));
		System.out.println(hash.containsKey(3));
		System.out.println(hash.containsKey(6));
		hash.put(6, "kratik");
		System.out.println(hash.containsKey(6));
		
		
		System.out.println("------------");
		
		for(Map.Entry<Integer, String> e : hash.entrySet()) {
//			System.out.println(e);
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}
}
