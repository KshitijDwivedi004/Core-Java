package collectionMethod;

import java.util.ArrayList;
import java.util.Collections;

public class Methods {
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(39);
		al.add(44);
		al.add(59);
		al.add(29);
		
		
		System.out.println(al);
//		Collections.rotate(al, 3);
		Collections.shuffle(al);
		System.out.println(al);
		
	}

}
