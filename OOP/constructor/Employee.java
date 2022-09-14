package in.com.raystec.constructor;

public class Employee extends Person {
	
	//attributes
protected String name;
protected String address;
protected int id;

//constructor
public Employee() {
System.out.println("Default constructor of employee class");	
	}
public Employee(String name, String address, int id) {
super(name, address);
System.out.println("parameterized constructor of employee class");
this.id = id;
}

//getter
public int getId() {
	return id;
}

}
