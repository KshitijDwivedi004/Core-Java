package com.kshitij.exception;

class MyException extends Exception
{
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	public MyException(String msg) {
		super(msg);
	}
	
}
public class cutomExceptionFirst {

    public static void main(String[] args) {
        int num1=6;
        int num2=-3;

        try{
            if(num2<0){
                throw new MyException("Entered a negative number");
            }
            else{
                int result=num1/num2;
                System.out.println("your rseult is "+ result);
            }
        }
        catch(Exception e){
            System.out.println("Enter a valid number " + e);
        }
    }
}
