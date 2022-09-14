package in.com.raystec.dataHiding;
public class Shape {
	//attribute
		private String color; //creating the attributes private or protected is the example of data hiding  
		
		public void setColor(String color) {
			this.color = color;		 
			
		}
		
		
		public String getColor() {
			return color;
		}
}