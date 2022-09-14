package in.com.raystec.exercise;
//Prime no = number  which is divisible by 1 and itself only 
public class QuestionNo11 {
	public static void main(String[] args) {
		int number = 17;
		int k= 0 ;
		for(int i = 2; i < number; i++) {
			if (number % i==0) {
				k++;
				break;
			 }
			}
		if(k==1)
		System.out.println("Number is not a prime number" );
		else
			System.out.println("Number is a prime number" );
			
		
	}
}
