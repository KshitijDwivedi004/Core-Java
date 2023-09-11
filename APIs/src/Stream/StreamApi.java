package Stream;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;


		public class StreamApi {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				List<Integer> list = Arrays.asList(6,9,1,5,2,8);
				Stream<Integer> streamData =list.stream();
				
//				long count= streamData.count();
//				System.out.println(count);
				
				Stream<Integer> sortedStream= streamData.sorted();
				sortedStream.forEach(n->System.out.println(n));
			}
		}
		
