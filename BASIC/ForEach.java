package in.com.raystec.String;

public class ForEach {
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 4, 6};
		
		//for loops
		
		for(int i = 0; i < arr.length; i++ ) {
			System.out.println(arr[i]);
	
		}
		System.out.println(" ");
		for(int v : arr) {
			System.out.println(v);
		}
	}
}
