package in.com.raystec.exception;

public class TestLoginExceptionThrows {

	//method
	private static void auth(String username) throws LoginException1   {
		if(!username.equals("admin")) {
			LoginException1 e = new LoginException1();
		throw e;	
		}
		
	}
	/*public static void main(String[] args)  {
		
		try{
			auth("Neeraj");	        //handle exception here or you can throws it to JVM
		}catch(LoginException1 e1) {
			System.out.println(e1.getMessage());
		}
		}*/
	
	
	
	public static void main(String[] args) throws LoginException1  {
	
	
		auth("Neeraj");	//handle exception here or you can throws it to JVM
	
	 
	 }
	}

