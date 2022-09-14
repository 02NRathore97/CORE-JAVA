package in.com.raystec.inheritance;

public class Rectangle extends Shape {
//attributes
	private int length = 0;
	private int width = 0;
	
	//getter
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}

		//setter
	public void setLength(int length) {
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	//method
	public void area() {
		int a = length*width;
		System.out.println("Area of the rectangle is : "+ a);
	}
	
}
