package in.com.raystec.java_8_features;

import java.util.Arrays;

public class Sort_vs_ParallelSort_Ex {
public static void main(String[] args) {
	int[] a = {11,20,50,8,26,30};
	System.out.println(a[0]);
	//Arrays.sort(a);
	Arrays.parallelSort(a);
	
	//System.out.println(Arrays.toString(a));
	
	for(int i : a) {
		System.out.println(i);
	}
	
}
}
