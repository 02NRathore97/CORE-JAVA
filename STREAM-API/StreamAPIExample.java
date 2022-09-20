package in.com.raystec.streamAPI;

import java.util.ArrayList;
import java.util.Collections;

public class StreamAPIExample {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>(10);
	a.add(5);
	a.add(10);
	a.add(10);
	a.add(10);
	a.add(20);
	
	Collections.sort(a);
	System.out.println(a);  //normal print
	
	a.forEach(l1->System.out.print(l1+" "));//print using forEach method
	
	System.out.println();
	//using StreamAPI
	
	
	a.stream().forEach(li->System.out.print(li + "  "));
	System.out.println();
	
	a.stream().sorted().forEach(li->System.out.print(li+" "));
	System.out.println();
	
	a.stream().sorted().distinct().forEach(li->System.out.print(li+" "));
	System.out.println();
	
	a.stream().filter(e->e%2==0).forEach(li->System.out.print(li+" "));
	
	}
}
