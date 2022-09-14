package in.com.raystec.QuesrionNo1;

public class Rectangle extends Shape {
	//attributes
		private int length = 0;
		private int width = 0;
		
		
		//setter
		public void setLength(int length) {
			this.length = length;
		}
	
	public void setWidth(int width) {
		this.width = width;
	}
		
		//getter
	public int getLength() {
		return length;
	}
		public int getWidth() {
			return width;
		}
	
		
	
		//constructor
		public Rectangle() {
			System.out.println("default constructor");
		}
		public Rectangle(int length, int width) {
			this.length = length;
			this.width = width;
		}
		
		//method
		public double area() {
			int a = length*width;
			return a;
		}
		

}
