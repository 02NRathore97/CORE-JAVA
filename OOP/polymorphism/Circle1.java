package in.com.raystec.polymorphism;

public class Circle1 extends Shape1 {
//attributes
	private int radius = 0;
	
//constructor
	public Circle1() {
		System.out.println("default constructor ");
	}
	public Circle1(int radius ) {
		this.radius = radius;
	}
	
	//getter
	public int getRadius() {
		return radius;
	}
	//method overriding
	public double area() {
		double a = PI*radius*radius;
		return a;
		
	}
	}

