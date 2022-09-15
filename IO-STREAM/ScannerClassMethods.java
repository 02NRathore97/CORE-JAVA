package in.com.raystec.IOStream;

import java.util.Scanner;

public class ScannerClassMethods {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter two no to add");
	//double a = sc.nextDouble();
	//double b = sc.nextDouble();
	//double c = a+b;
	//System.out.println(c);
	
	System.out.println(sc.nextDouble() + sc.nextDouble());
	}
}
