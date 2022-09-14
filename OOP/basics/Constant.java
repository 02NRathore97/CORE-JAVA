package in.com.raystec.basics;

public class Constant {
	
	//attributes
	private String color = null;
	public static final float PI = 3.14f;	//constant
	
	//constructors
		//default constructor
	public Constant(){
		System.out.println("Default constructor......");
	}
		//parameterized constructor
	public Constant(String color) {
		this.color = color;
		}
	
		//getter
	public String getColor() {
		return color;
	}
}
