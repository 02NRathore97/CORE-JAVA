package in.com.raystec.polymorphism;

public abstract class Shape2Abstract {//due to abstract method declaration inside the  class, class will also  becomes abstract
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
	public abstract void area();
}
