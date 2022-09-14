package in.com.raystec.exception;

public class Assignment {
public static void main(String[] args) {
	/* try {
		try
		{
			double div = 15/0;
			System.out.println(div);
		}catch(Exception e) {
			System.out.println("tryblock");	
		}
	 }catch(Exception e) {
		try
		{
			double div = 15/0;
			System.out.println(div);
		}catch(Exception e1) {
			System.out.println("catchblock");	
		}
	}finally {
		try
		{
			double div = 15/0;
			System.out.println(div);
		}catch(Exception e) {
			System.out.println("finallyblick");	
		}
	
	}*/
	 
	 
	 //.........................................................
	 
	 
	 
	/* try {
		 double div = 15/0;
			System.out.println(div);
		}finally {
			System.out.println(".........");
		}
		*/
	
	
	//..................................
	
	/*catch(Exception e){
		System.out.println("........");
	}
	*/
	
	//..................................
	
	/*finally {
		System.out.println(".................");
	}
	*/
	
	//.........................................
	
	try
	{
		double d = 15/0;
		System.out.println("This is a try block");
		
	}catch(Exception e) {
		System.out.println("This is a catch block");
		System.exit(0);
	}finally {
		System.out.println("This is a finally blick");
	}
	
	}
}