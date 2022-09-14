package in.com.raystec.String;

public class Commandline {
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(Integer.parseInt(args[i]));
			System.out.println(args[i]);
		}
		
	}
}
