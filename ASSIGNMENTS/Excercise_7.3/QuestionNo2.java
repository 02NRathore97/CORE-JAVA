package in.com.raystec.excercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class QuestionNo2 {
public static void main(String[] args) throws ParseException {
	String s = "02/07/1997";
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date d = sdf.parse(s);
	//System.out.println(d);
	
	Calendar cal =Calendar.getInstance();
	cal.setTime(d);
	
	for(int i =1; i<12; i++) {
		cal.add(Calendar.DATE, 30);
		
		Date t = cal.getTime();
		String s1 = sdf.format(t);
		System.out.println(s1);
		
	}
}
}
