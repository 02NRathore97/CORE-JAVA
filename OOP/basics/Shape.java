package in.com.raystec.basics;

public class Shape {
	//attribute
		private String color;   
		
	//setter without using this keyword
	/*public void setColor(String c) {	
			color = c;
	}*/
		
		
		//setter with using this keyword
		//this keyword differenciate global and local variable
		public void setColor(String color) {
			this.color = color;		 
			//global			//local
		}
		
		//getter
		public String getColor() {
			return color;
		}
}
