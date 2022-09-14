package in.com.raystec.excecise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class QuestionNo6 {
public static void main(String[] args) {
	// classes of Set interface
				Set s = new HashSet(); 
				Set s1 = new TreeSet();
				Set s2 = new LinkedHashSet();
			
			
			//  HashSet
			s.add(12);
			s.add(2.36);
			s.add('N');
			s.add("RATHORE");
			s.add("Neeraj");
			s.add(25);
			s.add(36.8);
			s.add('a');
			s.add(789);
			s.add(25);
			System.out.println("HashSet return the value in random order");
			System.out.println(s);  //HadhSet gives output in random order
			//only unique elements can be stored, duplicate is not allowed
			
			
		
			
			// Treeset 
			
			s1.add(12);
			s1.add(36);
			s1.add(5);
			s1.add(45);
			s1.add(54);
			s1.add(66);
			s1.add(78);
			s1.add(94);
			s1.add(100);
			s1.add(48);
			
			System.out.println("TreeSet return the value in Ascending order");
			System.out.println(s1); //TreeSet gives output in Ascending order
			
			
			
			// LinkedHash
			s2.add(12);
			s2.add(36);
			s2.add(5);
			s2.add(45);
			s2.add(54);
			s2.add(66);
			s2.add(78);
			s2.add(94);
			s2.add(100);
			s2.add(48);
			System.out.println("LinkedHash return the value in insertion order");
			System.out.println(s2); //LinkedHashSet gives output in insertion order
			
			
	
}
}
