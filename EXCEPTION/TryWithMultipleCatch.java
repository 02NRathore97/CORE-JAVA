package in.com.raystec.exception;

public class TryWithMultipleCatch {
	public static void main(String[] args) {
		try
		{
			double div = 15/0;
		System.out.println(div);
	
			String s = null;
			System.out.println(s.length());
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
		}catch(Exception e) {
			System.out.println("NullPointerException");
		}
		}
	}
