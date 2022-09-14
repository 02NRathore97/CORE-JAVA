package in.com.raystec.constructor;
//if we are calling constructor in same class then we use // this // keyword
public class SameClass {
	
	//attributes
protected String firstName;
protected String lastName;
protected String address = "Indore";

//constructor
public SameClass() {
	System.out.println("Default constructor");
}

public SameClass(String fn, String ln) {
	this();//calling default constructor
	System.out.println("constructor with two parameters");
	firstName = fn;
	lastName = ln;
	}
public static void main(String[] args) {
	SameClass sc = new SameClass("Neeraj","Rathore");
	
	System.out.println("Name : " + sc.firstName + " "+ sc.lastName);
	System.out.println("Address : " + sc.address);
}

}


