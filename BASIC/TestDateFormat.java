package in.com.raystec.Date;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
public static void main(String[] args)  {
	Date d = new Date();
	System.out.println(d);
	//change Date format 
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
	String s = sdf.format(d);
	System.out.println("After format change = "+s);

}
}
