package in.com.raystec.excecise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class QuestionNo2 implements Comparator<QuestionNo2> {
	//attributes
	private String name;
	private String salary;
	
	
	//default constructor
	public QuestionNo2() {
		// TODO Auto-generated constructor stub
	}

	//setter
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	//getter
	
	public String getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	 }
	@Override

	public int compare(QuestionNo2 ce1,QuestionNo2 ce2) {
		return ce1.getSalary().compareTo(ce2.getSalary());
	}
	public static void main(String[] args) {
		
		
		//Creating the object of QuestionNo2 class
		QuestionNo2 q = new QuestionNo2();
		q.setName("Amit");//setting the values
		q.setSalary("50000");
		
		QuestionNo2 q1 = new QuestionNo2();
		q1.setName("Neeraj");
		q1.setSalary("40000");

		QuestionNo2 q2 = new QuestionNo2();
		q2.setName("Vinod");
		q2.setSalary("45000");
		
		
		//Creating the object of ArrayList Class
		ArrayList<QuestionNo2> a = new ArrayList<QuestionNo2>();
		
		a.add(q);
		a.add(q1);
		a.add(q2);
		
		QuestionNo2  qn = new QuestionNo2(); 
		
		Collections.sort(a,qn);//Sorting on the basis of salary
		
		Iterator<QuestionNo2> it = a.iterator();
		while(it.hasNext()) {
			QuestionNo2 o = (QuestionNo2)it.next();
			System.out.println(o.getName()+" "+o.getSalary());
		}
	}
}
	


