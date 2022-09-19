package in.com.raystec.java_8_features;

public class TestDefault_and_Static_Method {
	public static void main(String[] args) {
		Default_and_Static_Method d = new Default_and_Static_Method() {};
		d.show();   // calling default method by using object of Default_and_Static_Method
		Default_and_Static_Method.print(); // calling static method by using the name of interface
	}
}
