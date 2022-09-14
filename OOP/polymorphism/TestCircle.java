package in.com.raystec.polymorphism;

public class TestCircle {
	public static void main(String[] args) {
		//Creating object of the CircleInheritShape
	Circle c = new Circle();

	//setting values
		c.setColor("Red");
		c.setRadius(5);
		
		
		//getting values
		System.out.println("The color of the circle : "+c.getColor());
		System.out.println("The radius of the circle : "+c.getRadius());
		double d = c.area();
		System.out.println("The area of the circle : "+ d);
		


	}
}
