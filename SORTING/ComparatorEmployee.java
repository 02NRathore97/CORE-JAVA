package in.com.raystec.sorting;

public class ComparatorEmployee {
//attributes
	private String fname;
	private String lname;
	private int id;
	
	//default constructor
	public ComparatorEmployee() {
		// TODO Auto-generated constructor stub
	}

	
	//getter   
		public String getFname() {
			return fname;
		}
		public String getLname() {
			return lname;
		}
		public int getId() {
			return id;
		}
	
	//setter
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
