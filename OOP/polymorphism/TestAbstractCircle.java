package in.com.raystec.polymorphism;

public class TestAbstractCircle {
public static void main(String[] args) {
	//Shape2Abstract sa = new Shape2Abstract();  	//this is abstract class,  instance of this class can not be created
	
	
	
	 Shape2Abstract sa; 												 //but object of this class can be created
	 							sa = new Circle2Abstract(5);		//but the instance will be created of child class that defined the abstract method
	 							

	 sa.setColor("Red");
	String s =  sa.getColor();
	 System.out.println("The color of the circle : "+ s);
	 sa.area();
}
}
