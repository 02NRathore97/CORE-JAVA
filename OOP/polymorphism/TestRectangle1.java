package in.com.raystec.polymorphism;

public class TestRectangle1 {
public static void main(String[] args) {
	
	Shape1 s = new Rectangle1(10,20);
	
	s.setColor("Yellow");
	String s1 = s.getColor();
	double d = s.area();
	System.out.println("The color of the rectangle : "+ s1);
	System.out.println("The area of the rectangle : "+ d);
}
}
