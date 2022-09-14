package in.com.raystec.cloning;

public class Employee implements Cloneable {
	
	//attributes
private String id;
private String fname ;
private String lname = null;
private Address addr;  //associativity
	//class    //object

    public Employee() {
    	System.out.println("default constructor");
    }

    //setter
	public void setId(String id) {
		this.id = id;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	
    
	//getter
	public String getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public Address getAddr() {
		return addr;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
