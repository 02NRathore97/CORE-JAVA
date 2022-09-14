package in.com.raystec.exception;

public class FinallyBlock {
public static void main(String[] args) {
	try
	{
		double div = 15/0;
	System.out.println(div);
	}catch(ArithmeticException e) {
		
		System.out.println("you can not divide by zero");
		System.err.println("you can not divide by zero");
		 }finally {
			 System.out.println("I am finally block ");
		 }
 	}
}
