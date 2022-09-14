package in.com.raystec.polymorphism;

public class TestTriangle1 {

	public static void main(String[] args) {
		Shape1 s = new Triangle1(10,20) ;
		
	s.setColor("blue");
	String s1 = s.getColor();
	double d = s.area();
	
	System.out.println("The color of the triangle : "+s1);
	System.out.println("The area of the triangle : "+d);
		}
	}
