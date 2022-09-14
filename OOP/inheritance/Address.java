package in.com.raystec.inheritance;

public class Address implements Cloneable {

	//attributes
	private String street;
	private String city;
	private String state;
	
	//constructor
	public Address() {
		System.out.println("Default constructor");
	}
	
	//setter
	public void setStreet(String street) {
		this.street = street;
		
	}
	public void setCity(String city) {
		this.city = city;
		}
	public void setState(String state) {
		this.state = state;
		}
	
	//getter
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
