package in.com.raystec.basics;

public class ConstantTest {

	public static void main(String[] args) {
	Constant c = new Constant();     //default constructor
	
	Constant c1 = new Constant("Red");
	
	System.out.println("Color : "+ c1.getColor());
	System.out.println("Constant : "+ Constant.PI); //constant calling by class name
	}

}
