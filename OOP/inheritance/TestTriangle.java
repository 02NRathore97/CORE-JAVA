package in.com.raystec.inheritance;

public class TestTriangle {
public static void main(String[] args) {
	//creating object of the TriangleInheritShape class
	 Triangle t = new Triangle();
	 
	 //setting values
	 t.setBase(20);
	 t.setHeigth(50);
	 t.setColor("blue");
	 
	 //getting values
	 String s = t.getColor();
		int b = t.getBase();
		int h = t.getHeigth();
		
		System.out.println("The color of the triangle  is : "+ s );
		System.out.println("The base of the triangle is : "+ b);
		System.out.println("The heigth of the triangle is : "+ h );
		t.area();
		
}
}
