package in.com.raystec.excecise;

import java.util.ArrayList;
import java.util.Iterator;

public class QuestionNo1 {
public static void main(String[] args) {
	ArrayList a = new ArrayList();//creating object of ArrayList class
	a.add(1);
	a.add(2);
	a.add(5);
	a.add(10);
	a.add('a');
	a.add("Name");
	
	//Iterator
	Iterator it = a.iterator();
	while(it.hasNext()) {
		Object o = (Object)it.next(); //typecast
		System.out.println(o);
	}
}
}
