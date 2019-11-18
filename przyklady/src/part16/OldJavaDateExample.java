package part16;

import java.util.Calendar;
import java.util.Date;

public class OldJavaDateExample {

	public static void main(String[] args) {

		Date date = new Date(2019 - 1900, 2 - 1, 16);
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(new Date(date.getTime() + 3600 * 1000 * 24 * 21));

		Calendar c = Calendar.getInstance();
//		c.set(2019, 11-1, 16);
		c.set(2020, 1-1, 1);
		c.add(Calendar.MONTH, 1);
		System.out.println(c.getTime());
	}
}
