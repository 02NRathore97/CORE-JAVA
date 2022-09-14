package in.com.raystec.constructor;

public class TestPersonEmployee {

	public static void main(String[] args) {
		Employee em = new Employee("Neeraj","Indore",12345);
		System.out.println("Name : " + em.getName());
		System.out.println("Address : " + em.getAddress());
		System.out.println("Id : "+ em.getId());
	}
}
