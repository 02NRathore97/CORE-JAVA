package in.com.raystec.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPersonWithConstructor{
		public static void main(String[] args) throws ParseException {
	
					String s = "02/11/1997";
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					Date d = new Date();
					d = sdf.parse(s);
	
					//default constructor  calling
					//PersonWithConstructor pwc = new PersonWithConstructor();
	
					//parameterized constructor
	PersonWithConstructor pwc = new PersonWithConstructor("Neeraj Rathore", d, "Indore");
			System.out.println("Name : " + pwc.getName());
	
			Date d1 = pwc.getDob();
			String sd = sdf.format(d1);
			System.out.println("Dob : " + sd);
			
			//System.out.println("Dob : " + pwc.getDob());
			System.out.println("Address : " + pwc.getAddress());
	
}
}
