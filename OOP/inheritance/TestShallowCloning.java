package in.com.raystec.inheritance;

public class TestShallowCloning {
public static void main(String[] args) throws CloneNotSupportedException {
	
	Employee e = new Employee();
	
	e.setName("Ram");
	e.setId("123abc");
	e.setStreet("Vijaynagar");
	e.setCity("Indore");
	e.setState("MP");
	
	Employee e1 = (Employee) e.clone();
	
	System.out.println("Name : " + e1.getName());
	System.out.println("ID : " + e1.getId());
	System.out.println("Address : " + ""+ e1.getStreet() + " " + e1.getCity() +" " + e1.getState());
}
}
