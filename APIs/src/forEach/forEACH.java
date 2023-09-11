package forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class forEACH {

	public static void main(String args[]) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(6);
		list1.add(8);
		list1.add(9);
//		System.out.println(list1);
		
//		for(Integer a : list1) {
//			System.out.print(a+" ");
//		}
		
		Consumer<Integer> con = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		};
		
		list1.forEach(con);
	}
}
