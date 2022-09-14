package in.com.raystec.QuesrionNo1;

public class TestShape {
public static void main(String[] args) {
	
	
	
	Shape[] s = new Shape[3];
	
	s[0] = new Circle(5);
	s[1] = new Rectangle(4,8);
	s[2] = new Triangle(6,9);
	
	System.out.println("The area of the circle is : "+ s[0].area());
	System.out.println("The area of the rectangle is : "+ s[1].area());
	System.out.println("The area of the triangle is : "+ s[2].area());
	
	
	double tarea = 0;
	for(int i = 0; i<s.length; i++) {
		tarea = tarea+ s[i].area();
	}
	System.out.println("Total area : " + tarea);
}
}
