package in.com.raystec.excercise;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class QuestionNo1 {
public static void main(String[] args) {
	//Creating object with the name of birhday for DOB
	LocalDate birthday = LocalDate.of(1997 , 07 , 02 ); 
	//Creating object with the name of today for todays date
	LocalDate today = LocalDate.now();
	
	//for only  years calculation 
		Long years = ChronoUnit.YEARS.between(birthday, today);
	System.out.println("Age in years"+years);
	
	//for year month day calculation
		Period p = Period.between(birthday, today);
	System.out.println("Year : " + p.getYears());
	System.out.println("Month : " + p.getMonths());
	System.out.println("Days : " + p.getDays());
}
}
