package in.com.raystec.basics;

import java.util.Date;

public class PersonWithConstructor {
	
	//attributes
	private String name = null;
	private Date dob = null;
	private String address = null;
	
	//default constructor
	public PersonWithConstructor() {
		System.out.println("This is default constructor......");
	}
	
	//constructor
	public PersonWithConstructor(String name , Date dob, String address) {
		this.name = name;
		this.dob = dob;
		this.address = address;
	}

 //getters
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
