package in.com.raystec.exercise;

public class QuestionNo14 {
	public static void main(String[] args) {
	int n = 5;
	double evensum= 0;
    double oddsum =0;
    double avg;
		for(int i =0; i<=n; i++) {
			if(i%2==0) {
				evensum+=i;
			}else{
				oddsum+=i;
			}
		}
		System.out.println("sum of even numbers  = " +evensum);
		System.out.println("sum of odd numbers  = " +oddsum);
		avg = (evensum+oddsum)/2;
		System.out.println("Avarage is  = "+avg);
	}
}
