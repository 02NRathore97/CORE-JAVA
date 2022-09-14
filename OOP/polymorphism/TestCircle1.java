package in.com.raystec.polymorphism;

public class TestCircle1 {

	public static void main(String[] args) {
		
		Shape1 s = new Circle1(5);
		
		  s.setColor("red");
		double d = s.area();
		
		System.out.println("The color of the circle : " +s.getColor());
		System.out.println("The area of the circle : " +d);

	}

}
