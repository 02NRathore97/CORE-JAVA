package in.com.raystec.exception;

public class Generic {
public static void main(String[] args) {
	try
	{
		double div = 15/0;
	System.out.println(div);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
