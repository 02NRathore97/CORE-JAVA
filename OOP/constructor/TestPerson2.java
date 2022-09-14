package in.com.raystec.constructor;


	public class TestPerson2 {

		public static void main(String[] args) {
			Employee1 em = new Employee1("Neeraj", "Indore", "Software-Engineering");
		System.out.println("Name : " + em.getName());
		System.out.println("Address : " + em.getAddress());
		System.out.println("Designation : " + em.getDesignation());
		em.changeAddress();
		}

}
