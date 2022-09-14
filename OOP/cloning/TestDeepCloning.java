package in.com.raystec.cloning;

public class TestDeepCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		//creating the object of address class 
		Address1 a = new Address1();
		a.setStreet("Vijaynagar");
		a.setCity("Indore");
		a.setState("M.P.");
		
		//creating the object of address class 
		Employee1 e = new Employee1();
		e.setFname("Ram");
		e.setLname("Sharma");
		e.setId("abc123");
		e.setAddr(a);
		
		Employee1 e1 = (Employee1) e.clone();
		Address1 a1 = (Address1) a.clone();
		
		System.out.println(e1.getId());
		System.out.println(e1.getFname());
		System.out.println(e1.getLname());
		System.out.println(e1.getAddr().getStreet());
		System.out.println(e1.getAddr().getCity());
		System.out.println(e1.getAddr().getState());
		
	System.out.println(".................................");
	
		System.out.println(a1.getStreet());
		System.out.println(a1.getCity());
		System.out.println(a1.getState());
		
		
	}
}
