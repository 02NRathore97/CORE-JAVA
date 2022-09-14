package in.com.raystec.exercise;

public class QuestionNo2 {
	public static void main(String[] args) {
		//using if else condition
		int a = 15;
		int b = 10;
		if(a<b) {
			System.out.println( "The smaller of  " + a +" and  " + b   + " is  = " + a);
		}else {
			System.out.println("The smaller of  " + a +" and  " + b   + " is  = " + b);
				}
		//using ternary operator
	int c = (a < b) ? a : b;
		System.out.println("The smaller of  " + a +" and  " + b   + " is  = "+  c);
	}
	
}
