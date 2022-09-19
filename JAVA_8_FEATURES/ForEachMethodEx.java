package in.com.raystec.java_8_features;

import java.util.ArrayList;

public class ForEachMethodEx {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		
		
		//output using foreach loop
		for(Object o : a) {
			System.out.println(o);
		}
		
		//foreach loop can be replaced by foreach method
		
		a.forEach(li->System.out.println(li));
		}
	}

