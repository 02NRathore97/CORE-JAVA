package in.com.raystec.inheritance;

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
	//methods
	public void area() {
		double a = PI*radius*radius;
		System.out.println("Area of the circle is : "+ a);
	}
	
	
}
