package CollectionMethod;

import java.util.ArrayList;
import java.util.Collections;

public class Methods {
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(33);
		al.add(45);
		al.add(66);
		al.add(71);
		
		Collections.sort(al);
		System.out.println(al);
	}
}
