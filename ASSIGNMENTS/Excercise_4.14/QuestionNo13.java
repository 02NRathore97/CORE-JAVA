//harmonic series
package in.com.raystec.exercise;

public class QuestionNo13 {
	public static void main(String[] args) {
		double result = 0.0d;
		
		float n = 5f;
		for(float i = 1; i<=n; i++) {
			
		System.out.print("+ 1/"+i +" ");
		
		result = result +1/i ;
		}
		System.out.println(" = "+ result);
	}
}
