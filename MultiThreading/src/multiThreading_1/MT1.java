package multiThreading_1;

public class MT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main thread");
		String name = Thread.currentThread().getName();
		System.out.println("name of current Thread " + name);
		System.out.println("Priority of ccurrent Thread is : "+ Thread.currentThread().getPriority());
		
		
		
		

	}

}
