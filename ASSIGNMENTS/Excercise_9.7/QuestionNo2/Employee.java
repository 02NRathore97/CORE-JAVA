package in.com.raystec.QuestionNo2;



public class Employee extends Address {

	//attributes

private String fname ;
private String lname = null;


//constructor
public Employee() {
	System.out.println("default constructor");
}

	//method
	public String setNameId(String fname, String lname, String id) {
		this.fname = fname;
		this.lname = lname;
		
	return fname+"  "+lname;	
	}
}
