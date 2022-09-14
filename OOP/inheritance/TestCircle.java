package in.com.raystec.inheritance;

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
	c.area();
	


}
}
