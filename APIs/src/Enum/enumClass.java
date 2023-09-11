package Enum;

enum week{
	MON ,TUE, WED , THUR , FRI;
	
}

public class enumClass {
	enum result{
		PASS, FAIL ,NR;
		int marks;
		
		result(){
			System.out.println("constructor in Enum");
		}
		void setMarks(int marks) {
			this.marks=marks;
		}
		int getMarks() {
			return marks;
		}
	}
public static void main(String args[]) {
//	week day = week.MON;
//	System.out.println(day);
//	
//	week w[]=week.values();
//	
//	for(week x:w) {
//		System.out.println(x);
//		
//	}
	result.PASS.setMarks(84);
	
	int m1=result.PASS.getMarks();
	System.out.println(m1);
}
}
