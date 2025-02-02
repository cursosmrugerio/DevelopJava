package dateTime;

import java.time.*;
import java.time.Month;
import java.time.DayOfWeek;

public class Principal {

	public static void main(String[] args) {

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		
		System.out.println(Month.FEBRUARY);
		System.out.println(DayOfWeek.SUNDAY);
		
		LocalDate date = LocalDate.of(2022, Month.JANUARY, 20);
		
		date = date.plusDays(2);
		
		date = date.plusWeeks(1);
		
		date = date.plusMonths(1);
		
		date = date.plusYears(5);
		
		System.out.println(date);
		
		
		
		

	}

}
