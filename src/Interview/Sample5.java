package Interview;

import java.util.Calendar;

public class Sample5 {

	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));

	}

}
