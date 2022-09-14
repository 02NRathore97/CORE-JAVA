package in.com.raystec.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortMethod {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add(1);
	a.add(5);
	a.add(2);
	a.add(7);
	
	Collections.sort(a);
	System.out.println(a);//it gives list in ascending order
	
	Collections.reverse(a);
	System.out.println(a);//it gives list in descendin order
}
}
