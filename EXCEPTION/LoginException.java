package in.com.raystec.exception;

/*public class LoginException extends Exception {//creating customized exception class
	
	//constructor of LoginException class
	public LoginException() {
		super("user not found");
		}
	}*/




public class LoginException extends RuntimeException {//creating customized exception class
	
	//constructor of LoginException class
	public LoginException() {
		super("user not found");
		}
	}
