package in.com.raystec.inheritance;

public class Employee extends Address {

	//attributes
	private String name;
	private String id;
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
}
