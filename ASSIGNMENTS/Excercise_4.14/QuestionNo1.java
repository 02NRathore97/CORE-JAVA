package in.com.raystec.exercise;

public class QuestionNo1 {
	public static void main(String[] args) {
		//using if else
		int a = 5;
		int b = 10;
	if(a>b) {
		System.out.println("The maximum of  " + a +" and  " + b   + " is =  " + a);
	}else {
		System.out.println("The maximum of  " + a +" and  " + b   + " is  = " + b);
			}
	//using math class mathed
	System.out.println("The maximum of "+ a +" and  " + b   + " is =  "+Math.max(5, 10));
		}
}
