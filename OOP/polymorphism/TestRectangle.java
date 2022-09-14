package in.com.raystec.polymorphism;

public class TestRectangle {
public static void main(String[] args) {
	//creating object of ractangle class
	Rectangle r = new Rectangle();
	
	//settng values
	r.setColor("yellow");
	r.setLength(6);
	r.setWidth(10);
	
	//getting values
	String s = r.getColor();
	int l = r.getLength();
	int w = r.getWidth();
	
	
	System.out.println("The color of the rectangle is : "+ s );
	System.out.println("The length of the rectangle is : "+ l);
	System.out.println("The width of the rectangle is : "+ w );
	double d = r.area();
	System.out.println("Area of the rectangle is : "+ d);
	
	
}
}

