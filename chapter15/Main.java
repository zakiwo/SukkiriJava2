package chapter15;

import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2021, 11, 2, 11, 59, 33);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
		
		
	}
}
