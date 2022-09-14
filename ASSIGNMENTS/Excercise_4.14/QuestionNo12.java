package in.com.raystec.exercise;
//palindrome no => reverase of number  should be equal to  the original number
public class QuestionNo12 {
	public static void main(String[] args) {
		int number = 1231;
		int n =number;
		int rem;
		int sum = 0;
		while(n!=0) {
			rem = n%10;
			sum = sum*10+rem;
			n = n/10;
		}
		//System.out.println(sum);
		if(sum == number) 
			System.out.println("Number is palindrome");
			else
				System.out.println("Number is not palindrome");
		}
	}
