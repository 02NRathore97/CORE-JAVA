package in.com.raystec.constructor;

public class Person {
	//attributes
protected String name;
protected String address;

//constructor
public Person() {
	System.out.println("Default constructor of person class");
}
public Person(String name, String address) {
	this();
	System.out.println("parameterized constructor of person class ");
	this.name = name;
	this.address = address;
}


//getter
public String getName() {
	return name;
}
public String getAddress() {
	return address;
}


}
