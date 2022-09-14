package in.com.raystec.excecise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class QuestionNo3 implements Comparator<QuestionNo3> {
	//attributes
		private String fname;
		private String lname;
		private int id;
		
		//default constructor
		public QuestionNo3() {
			// TODO Auto-generated constructor stub
		}

		
		//getter   
			public String getFname() {
				return fname;
			}
			public String getLname() {
				return lname;
			}
			public int getId() {
				return id;
			}
		
		//setter
		public void setFname(String fname) {
			this.fname = fname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public void setId(int id) {
			this.id = id;
		}
		@Override

		public int compare(QuestionNo3 ce1,QuestionNo3 ce2) {
			int i=  ce1.getLname().compareTo(ce2.getLname());
			if(i==0) {
				i = ce1.getFname().compareTo(ce2.getFname());
			}
			 return i;
		}
  
 
		public static void main(String[] args) {
			QuestionNo3 c = new QuestionNo3();
			 c.setFname("Ram");
			 c.setLname("Verma");
			 c.setId(100);
			 
			 QuestionNo3 c1 = new QuestionNo3();
			 c1.setFname("Ajay");
			 c1.setLname("Jain");
			 c1.setId(201);
			 
			 QuestionNo3 c2 = new QuestionNo3();
			 c2.setFname("Ram");
			 c2.setLname("Sharam");
			 c2.setId(412);
			 
			 QuestionNo3 c3 = new QuestionNo3();
			 c3.setFname("Chandan");
			 c3.setLname("Sen");
			 c3.setId(526);
			 
			 ArrayList a = new ArrayList();
			 a.add(c);
			 a.add(c1);
			 a.add(c2);
			 a.add(c3);
			 
			 QuestionNo3  qn = new QuestionNo3(); 
				
				Collections.sort(a,qn);//Sorting on the basis of salary
				
				Iterator<QuestionNo3> it = a.iterator();
				while(it.hasNext()) {
					QuestionNo3 o = (QuestionNo3)it.next();
					 System.out.println(o.getFname()+" "+o.getLname()+" "+o.getId());

				}
		}
}
