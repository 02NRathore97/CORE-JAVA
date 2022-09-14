package in.com.raystec.exercise;
//Armstrong number = 153 => (1*1*1)+(5*5*5*)+(3*3*3)=153
public class QuestionNo10 {
	public static void main(String[] args) {
		int number = 153;
		int sum = 0;
		 int rem;
		 int n = number;
		 while(n != 0) {
			 rem = n%10;
			 sum = sum+(rem*rem*rem);
			 n = n/10;
		 }
		 if(sum == number) {
			 System.out.println("Number is armstrong ");
		 }
		 else {
			 System.out.println("Number is not  armstrong ");
		 }
	}
}
