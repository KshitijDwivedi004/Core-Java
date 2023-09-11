package Mt2;

import java.util.Scanner;

public class mt2 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("starting calculation");
		System.out.println("Enter the first No. ");
		int a=sc.nextInt();
		System.out.println("Enter the second No. ");
		int b=sc.nextInt();
		
		int res= a*b;
		System.out.println("calculation has Ended & your resut is : "+res);
		System.out.println("*******************************");
		
	}

}
