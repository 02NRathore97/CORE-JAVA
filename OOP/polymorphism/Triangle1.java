package in.com.raystec.polymorphism;

public class Triangle1 extends Shape1 {
//attributes
	private int base = 0;
	private int heigth =0;
	
	//setter
	/*public void setBase(int base) {
		this.base = base;
	}
	public void setHeight(int heigth) {
		this.heigth = heigth;
	}*/
	
	//constructor
	public Triangle1() {
		System.out.println("this is default constructor");
	}
	public Triangle1(int base, int heigth) {
	this.base = base;
	this.heigth = heigth;
	}
	
	//getter
	public int getBase() {
		return base;
	}
	public int getHeigth() {
		return heigth;
	}
	
	//method
	
	public double area() {
		double a = (base*heigth)/2;
		return a;
	}
}
