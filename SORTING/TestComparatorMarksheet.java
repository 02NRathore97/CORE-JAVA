package in.com.raystec.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparatorMarksheet {
	public static void main(String[] args) {
		ComparatorMarksheet m = new ComparatorMarksheet();
		m.setRollNo("1");
		m.setFname("Amit ");
		m.setLname("Sharam");
		m.setPhy(88);
		m.setChem(88);
		m.setMath(90);
		
		ComparatorMarksheet m1= new ComparatorMarksheet();
		
		m1.setRollNo("2");
		m1.setFname("Amit ");
		m1.setLname("Rathore");
		m1.setPhy(80);
		m1.setChem(76);
		m1.setMath(95);
		
		ComparatorMarksheet m2 = new ComparatorMarksheet();
		
		m2.setRollNo("3");
		m2.setFname("Vinod ");
		m2.setLname("Rathore");
		m2.setPhy(88);
		m2.setChem(88);
		m2.setMath(90);
		
		ComparatorMarksheet m3 = new ComparatorMarksheet();
		
		m3.setRollNo("4");
		m3.setFname("Shubham ");
		m3.setLname("Bairagi");
		m3.setPhy(88);
		m3.setChem(88);
		m3.setMath(90);
		
		ArrayList a = new ArrayList();
		
		a.add(m);
		a.add(m1);
		a.add(m2);
		a.add(m3);
		
		ComparatorMarksheet c = new ComparatorMarksheet();
	
		
		Collections.sort(a,c);
		
		
		
		Iterator it = a.iterator();
		while(it.hasNext()) {
			ComparatorMarksheet cm = (ComparatorMarksheet)it.next();
			System.out.println(cm.getRollNo()+" "+ cm.getFname() +" "+ cm.getLname() +"  phy : "+cm.getPhy() +" chem : "+cm.getChem()+"math : "+cm.getMath());
		}
		

}
}