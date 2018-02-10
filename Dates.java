import java.time.*;
import java.time.format.*;

public class Dates {
	public static void main(String[] ars) {
		
		/*LocalTime t = LocalTime.now();
		LocalDate d = LocalDate.now();
		System.out.println("the date and time is: " + t + " " + d);


		LocalDate yesterday = LocalDate.of(2018, 1, 26);
		LocalTime noon = LocalTime.of(12, 0);
		LocalDateTime l = LocalDateTime.of(2018, 1, 26, 12, 0);
		System.out.println("yesterday's date is: " + yesterday);
		System.out.println("noon" + noon);
		System.out.println("Yesterdays's date at noon is: " + l);
		*/

		LocalDate today = LocalDate.now();
		LocalDate endOfMonth = LocalDate.of(2018, 01, 31);
		Period untilEndOfMonth = today.until(endOfMonth);
		int daysLeft = untilEndOfMonth.getDays();

		System.out.println("number of days left in this month is: " + today.until(endOfMonth));
		System.out.println("number of days left in this month is: " + daysLeft);
	}
}