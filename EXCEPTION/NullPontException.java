package in.com.raystec.exception;

public class NullPontException {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("Enter the String to find length");
		}
		
		
		//catch(NullPointerException e) {
			//System.out.println("please enter any string to find length");
		//}
	
	}
}
