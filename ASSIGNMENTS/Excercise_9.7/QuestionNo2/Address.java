package in.com.raystec.QuestionNo2;

public class Address implements Cloneable {

	
	//attributes
private String street = null;
private String city = null;
private String state = null;

//constructor
public Address() {
	System.out.println("Default constructor");
}

//methods
public String setLocalAddress(String street, String city, String state) {
	this.street = street;
	this.city = city;
	this.state = state;
	return street+", "+city+", "+state;
}
public String setPermanentAddress(String street, String city, String state) {
	this.street = street;
	this.city = city;
	this.state = state;
	return street+", "+city+", "+state;
}



@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

}
