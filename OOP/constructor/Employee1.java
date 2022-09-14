package in.com.raystec.constructor;

public class Employee1 extends Person1 {
	//attributes
	private String name = null;
	private String address = null;
	private String designation  = null;
	
//constructor
public Employee1() {
	System.out.println("Default constructor of employee class");
}
public Employee1(String name, String address, String designation) {
	super(name, address);
	System.out.println("parameterized constructor of employee class");
	this.designation = designation;
}

//getter
public String getDesignation() {
	return designation;
}

//method
public void changeAddress() {
	super.changeAddress();
	System.out.println(" : pune");
}

}
