package in.com.raystec.basics;

public class ShapeTest {
	public static void main(String[] args) {
		
		//Shape sh;								//declaration
		//sh = new Shape();				//instantiation
		
		Shape sh = new Shape();		//declaration + instantiation
		sh.setColor("red");
		
		//we can hold return value into another variable and then print 
		String s = sh.getColor();		
		System.out.println(s);
		
		// we can directly print
		//System.out.println(sh.getColor()); 		
	}
}
