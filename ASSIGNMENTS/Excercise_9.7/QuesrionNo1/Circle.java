package in.com.raystec.QuesrionNo1;

public class Circle extends Shape {
	//attributes
	private double radius = 0;
	
	
//getter
	public double getRadius() {
		return radius;
	}
	//setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//constructor
	public Circle() {
		System.out.println("Default constructor");
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	//methods
	public double area() {
		double a = PI*radius*radius;
		return a;
	}
}
	