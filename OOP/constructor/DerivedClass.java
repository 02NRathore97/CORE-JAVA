package in.com.raystec.constructor;

public class DerivedClass extends BaseClass {
	public DerivedClass(String fn , String ln, String add) {
		super(fn, ln);       //calling constructor that have two parameters
		System.out.println("constructor of derived class with three parameters");
		address = add;
		}

public static void main(String[] args) {
	BaseClass bc = new DerivedClass("NEERAJ","RATHORE","INDORE");
System.out.println("NAME : " + bc.firstName +" " +bc.lastName);
System.out.println("Address : " + bc.address);
}
}
