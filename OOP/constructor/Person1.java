package in.com.raystec.constructor;

public class Person1 {
	
	//attributes
private String name = null;
private String address = null;


//constructor
public Person1() {
	System.out.println("Default constructor of person1 class");
}
public Person1(String name, String address) {
	this();
	System.out.println("paramerterized constructor of person1 class");
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

//method
public void changeAddress() {
	System.out.print("Change address ");
}
}
