package dataApi;
import java.sql.Time;
import java.util.Date;
public class DateApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Date dt= new Date();
		System.out.println(dt);
		long timeInMs=dt.getTime();
		
		Time sdt = new Time(timeInMs);
		System.out.println(sdt);

	}

}
