package in.com.raystec.QuestionNo2;

public class Department extends Employee {
	
	
public static void main(String[] args) throws CloneNotSupportedException  {
	Address a = new Department();
	Address e = new Employee();
	

	Address a1 = (Address) a.clone();
	Address a2 = (Address) a.clone();
	Address a3 = (Address) a.clone();
	
	Employee e1 = (Employee) a.clone();
	Employee e2 = (Employee) a.clone();
	Employee e3 = (Employee) a.clone();
	
	//setting the values
	String s = e1.setNameId("NEERAJ","RATHORE","ABC123");
	String la = a1.setLocalAddress("Indore", "INDORE", "MP");
	String pa = a1.setPermanentAddress("Indore", "INDORE", "MP");
	
	String s1 = e2.setNameId("AMIT","RATHORE","ABC124");
	String la1 = a2.setLocalAddress("Indore", "INDORE", "MP");
	String pa1 = a2.setPermanentAddress("Indore", "INDORE", "MP");
	
	String s2 = e3.setNameId("SHUBHAM","BAIRAGI","ABC125");
	String la2 = a3.setLocalAddress("Indore", "INDORE", "MP");
	String pa2 = a3.setPermanentAddress("Indore", "INDORE", "MP");

	
	System.out.println("Name : " + s);
	System.out.println("Local address : " + la);
	System.out.println("Permanent address : " + pa);
	System.out.println(" ");
	System.out.println("Name : " + s1);
	System.out.println("Local address : " + la1);
	System.out.println("Permanent address : " + pa1);
	System.out.println(" ");
	System.out.println("Name : " + s2);
	System.out.println("Local address : " + la2);
	System.out.println("Permanent address : " + pa2);
  
  

	
	
}
}
