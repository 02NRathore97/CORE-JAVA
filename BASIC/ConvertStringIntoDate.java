package in.com.raystec.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringIntoDate {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
	String s = "02/07/1997";
	Date d1 = sdf.parse(s);
	System.out.println(d1);
	
	}
}
