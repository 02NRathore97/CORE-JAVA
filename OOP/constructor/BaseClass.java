package in.com.raystec.constructor;
//if //if we are calling constructor in inheritance  then we use // super // keyword .
public class BaseClass {
	//attributes
protected String firstName;
protected String lastName;
protected String address;

//constructor
public BaseClass() {
	System.out.println("Default constructor of base class");
}
public BaseClass(String fn, String ln) {
	this();            //calling default constructor 
	System.out.println("constructor of base class with two parameters");
	firstName = fn;
	lastName = ln;
	}

}
