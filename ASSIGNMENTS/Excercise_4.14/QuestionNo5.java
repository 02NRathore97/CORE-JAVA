package in.com.raystec.exercise;

public class QuestionNo5 {
	public static void main(String[] args) {
		int number = 1345;
		int n = number;
		int rem;
		int sum = 0;
		while(n != 0 ) {
			rem = n%10;
			sum = sum*10 + rem;
			n =  n/10;
			
		}
		System.out.println("The reverse of given no is " + sum);
		
	}
}
