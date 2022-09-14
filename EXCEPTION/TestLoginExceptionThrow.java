package in.com.raystec.exception;

public class TestLoginExceptionThrow {
	private static void auth(String username) { //method definition
		if(!username.equals("admin")) {
			LoginException e = new LoginException();
		try {
			throw e;
		}catch(LoginException e1) {
			System.out.println(e1.getMessage());
			}
		}
	}
	
		public static void main(String[] args) {//main method
			auth("Vijay");//method calling
		}
		
	}


