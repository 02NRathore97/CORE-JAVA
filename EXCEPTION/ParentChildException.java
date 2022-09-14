package in.com.raystec.exception;

public class ParentChildException {
public static void main(String[] args) {
	try
	{
		double div = 15/0;
	System.out.println(div);
	}
	catch(ArithmeticException e) {
		System.err.println("you can not divide by zero");
	}catch(Exception e) {
		System.out.println(e.getMessage());
		}
	
	}
}
