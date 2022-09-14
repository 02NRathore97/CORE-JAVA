package in.com.raystec.exercise;

public class QuestionNo16 {
public static void main(String[] args) {
	int []a = {1,2,3,4,5,6,7,8};
	int temp =0;
	for(int i = 0; i<a.length; i++) {
		for(int j =i+1; j<a.length; j++ ) {
			if(a[i]>a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	System.out.println("The largest no is = "+ a[a.length-2]);
}
}
