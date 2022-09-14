package in.com.raystec.constructor;

public class SameClass1 {
	
	//attributes
protected String firstName;
protected String lastName;
protected String address;

//constructor
public SameClass1() {
	System.out.println("Default constructor");
}
public SameClass1(String fn, String ln) {
	this();            //calling default constructor
	System.out.println("constructor with two parameters");
	firstName = fn;
	lastName = ln;
	}
public SameClass1(String fn , String ln, String add) {
	this(fn, ln);       //calling constructor that have two parameters
	System.out.println("constructor with three parameters");
	address = add;
}
public static void main(String[] args) {
	SameClass1 sc = new SameClass1("Neeraj","Rathore","Indore");
	
	System.out.println("Name : " + sc.firstName + " "+ sc.lastName);
	System.out.println("Address : " + sc.address);
}

}
