package in.com.raystec.cloning;

public class TestShallowCloning {
public static void main(String[] args) throws CloneNotSupportedException {
	
	//creating the object of address class 
	Address a = new Address();
	a.setStreet("Vijaynagar");
	a.setCity("Indore");
	a.setState("M.P.");
	
	//creating the object of address class 
	Employee e = new Employee();
	e.setFname("Ram");
	e.setLname("Sharma");
	e.setId("abc123");
	e.setAddr(a);
	
	Employee e1 = (Employee) e.clone();
	
	System.out.println(e1.getId());
	System.out.println(e1.getFname());
	System.out.println(e1.getLname());
	System.out.println(e1.getAddr().getStreet());
	System.out.println(e1.getAddr().getCity());
	System.out.println(e1.getAddr().getState());
	
}
}
