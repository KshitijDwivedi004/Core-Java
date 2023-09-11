package JodaAPI;

import java.time.*;
public class timeAPI {
	public static void main(String args[]) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		
		System.out.println(day + "/" + month +"/"+ year);
		
		LocalTime time = LocalTime.now();
		
		int hour = time.getHour();
		int min=  time.getMinute();
		int sec = time.getSecond();
		
		System.out.println("time is : "+hour+":"+min+":"+ sec);
	}
}
