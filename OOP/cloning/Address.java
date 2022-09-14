package in.com.raystec.cloning;

public class Address {
	//attributes
private String Street = null;
private String city = null;
private String state = null;

//constructor
public Address() {
	System.out.println("Default constructor");
}

//setter

public void setStreet(String street) {
	Street = street;
}
public void setState(String state) {
	this.state = state;
}
public void setCity(String city) {
	this.city = city;
}

//getter
public String getState() {
	return state;
}
public String getStreet() {
	return Street;
}
public String getCity() {
	return city;
}



}
