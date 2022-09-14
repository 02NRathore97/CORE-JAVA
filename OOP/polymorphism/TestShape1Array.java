package in.com.raystec.polymorphism;

public class TestShape1Array {

	public static void main(String[] args) {
		
		//creating array of class
		Shape1[] s = new Shape1[3];
		
		s[0] = new Circle1(6); 
		s[1] = new Triangle1(10, 20);
		s[2] = new Rectangle1(5,10);
		
		//printing maually
	System.out.println("Area of the circle : "+s[0].area());
		System.out.println("Area of the triangle : "+s[1].area());
		System.out.println("Area of therectangle : "+s[2].area());
		
		
		//using for loop
		/*for(int i = 0 ; i<s.length; i++) {
			System.out.println(s[i].area());
			
		}*/
		
		//total area using method
		double tarea = calcArea( s); 
		System.out.println("total area : " + tarea);
		
	}
	//method declaration outside main method
	public static double calcArea(Shape1[] s) {
		
		double tarr = 0;
		for(int i = 0; i<s.length; i++) {
			tarr = tarr+s[i].area();
		}
		return tarr;
	} 

}
