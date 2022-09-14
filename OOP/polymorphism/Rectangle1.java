package in.com.raystec.polymorphism;

public class Rectangle1 extends Shape1 {
//attributes
	private int length = 0;
	private int width = 0;
	
	//constructor
	public Rectangle1() {
		System.out.println("default constructor");
	}
	public Rectangle1(int length, int width) {
	this.length = length;
	this.width = width;
	}
	
	//method overriding
	public double area() {
		double a = length*width;
		return a;
	}
	
}
