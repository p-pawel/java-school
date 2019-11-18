package part16;

import java.time.chrono.HijrahDate;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.chrono.ThaiBuddhistDate;

public class Task17 {

	public static void main(String[] args) {


		System.out.println(HijrahDate.now());
		System.out.println(JapaneseDate.now());
		System.out.println(ThaiBuddhistDate.now());
		System.out.println(MinguoDate.now());
	}
}
