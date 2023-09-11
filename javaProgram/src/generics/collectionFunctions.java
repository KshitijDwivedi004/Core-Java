package generics;

import java.util.ArrayList;
import java.util.Collections;

public class collectionFunctions {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(12);
		al.add(54); 
		al.add(77);
		al.add(65);
		al.add(45);
		
		System.out.println( Collections.binarySearch(al, 54));
		
	

}
