package in.com.raystec.QuesrionNo1;

public abstract class Shape {
	//attributes
		private String color  = null;
		public static final float PI = 3.14f;
		
		//setter
		public void setColor(String color) {
			this.color = color;
		}
		
		//getter
		public String getColor() {
			return color;
		}
		
		
		//abstact method declaration
		public abstract double area();
}
