package in.com.raystec.methods;

public class BubbleSortExample {
	public void bubblesort() {
		int []a = {5,7,3,1,6,8,9};
		int temp;
		System.out.print("Before swapping = ");
		for(int i = 0; i<a.length; i++) {
			System.out.print( + a[i] + " ");
		
		}
		//for ascending order
		for(int i = 0; i<a.length; i++) {
			for(int j= i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] =  temp;
				}
			}
		}
		System.out.print("\n Ascending order After swapping = ");
		for(int i = 0; i<a.length; i++) {
			System.out.print( + a[i] + " ");
		
		}
		//for Descending order
		for(int i = 0; i<a.length; i++) {
			for(int j= i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] =  temp;
				}
			}
		}
		System.out.print("\n Descending  order After swapping = ");
		for(int i = 0; i<a.length; i++) {
			System.out.print( + a[i] + " ");
		
		}
	
	}
	
	public static void main(String[] args) {
		BubbleSortExample bs = new BubbleSortExample();
		bs.bubblesort();
	}
}