package in.com.raystec.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparableMarksheet {
public static void main(String[] args) {
	ComparableMarksheet m = new ComparableMarksheet();
	
	m.setRollNo("1");
	m.setFname("Neeraj ");
	m.setLname("Rathore");
	m.setPhy(88);
	m.setChem(88);
	m.setMath(90);
	
ComparableMarksheet m1 = new ComparableMarksheet();
	
	m1.setRollNo("2");
	m1.setFname("Amit ");
	m1.setLname("Rathore");
	m1.setPhy(80);
	m1.setChem(76);
	m1.setMath(95);
	
ComparableMarksheet m2 = new ComparableMarksheet();
	
	m2.setRollNo("3");
	m2.setFname("Vinod ");
	m2.setLname("Rathore");
	m2.setPhy(88);
	m2.setChem(88);
	m2.setMath(90);
	
ComparableMarksheet m3 = new ComparableMarksheet();
	
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
	
	Collections.sort(a); 
	
	Iterator it = a.iterator();
	while(it.hasNext()) {
		ComparableMarksheet cm = (ComparableMarksheet)it.next();
		System.out.println(cm.getRollNo()+" "+ cm.getFname() +" "+ cm.getLname() +"  phy : "+cm.getPhy() +" chem : "+cm.getChem()+"math : "+cm.getMath());
	}
	
}
}
