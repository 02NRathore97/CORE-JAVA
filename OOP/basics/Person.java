package in.com.raystec.basics;

import java.util.Date;

public class Person {
	//attributes
	private String name;
	private Date dob;
	private String address;
	
	
	//setter 
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(Date dob) {
		this.dob = dob ;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public Date getDob() {
		return dob;
	}
	public String getAddress() {
		return address;
	}
	
}
