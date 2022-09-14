package in.com.raystec.polymorphism;

public class Circle extends Shape{
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
		//methods overriding
		public double area() {
			double a = PI*radius*radius;
			return a;
		}
		
		
}
