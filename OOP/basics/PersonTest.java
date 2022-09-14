package in.com.raystec.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonTest {

	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		String s = "02/11/1997";
		Date d1 = sdf.parse(s);
		
		p.setName("Neeraj Rathore");
		p.setDob(d1);
		p.setAddress("Indore");
		
		
		System.out.println("Name : "+p.getName());
		System.out.println("Dob : "+p.getDob());
		System.out.println("Address : "+p.getAddress());
	}
}
