package oops;
@FunctionalInterface
interface car{
	void drive(int speed);
}
public class innerClass {
	
public static void main(String args[] ) {
	car obj = (speed)-> {
	System.out.println("driving... with speed "+ speed);
	System.out.println("spped is below avg");
	};
		
	obj.drive(25);
}
}
