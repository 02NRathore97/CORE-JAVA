package in.com.raystec.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestComparatorEmployee {
	public static void main(String[] args) {
	 ComparatorEmployee c = new ComparatorEmployee();
	 c.setFname("Ram");
	 c.setLname("Verma");
	 c.setId(1);
	 
	 ComparatorEmployee c1 = new ComparatorEmployee();
	 c1.setFname("Ajay");
	 c1.setLname("Jain");
	 c1.setId(2);
	 
	 ComparatorEmployee c2 = new ComparatorEmployee();
	 c2.setFname("Ram");
	 c2.setLname("Sharam");
	 c2.setId(3);
	 
	 ComparatorEmployee c3 = new ComparatorEmployee();
	 c3.setFname("Chandan");
	 c3.setLname("Sen");
	 c3.setId(3);
	 
	 ArrayList a = new ArrayList();
	 a.add(c);
	 a.add(c1);
	 a.add(c2);
	 a.add(c3);
	
	 EmployeeOrderByLname o1 = new EmployeeOrderByLname();
	  Collections.sort(a,o1);
	  
	 EmployeeOrderByFname o = new EmployeeOrderByFname();
	 Collections.sort(a,o);
	 
	 Iterator it = a.iterator();
	 while(it.hasNext()) {
		 ComparatorEmployee ce = (ComparatorEmployee)it.next();
		 System.out.println(ce.getFname()+" "+ce.getLname()+" "+ce.getId());
	 }
	 
 }
}
