package in.com.raystec.polymorphism;


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
			public double area() {
				int a = length*width;
				return a;
			}
			
		}


