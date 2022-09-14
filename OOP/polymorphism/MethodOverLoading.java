package in.com.raystec.polymorphism;

public class MethodOverLoading {
	public void add() {
		
		int a = 5;
		int b = 4;
		int c = a+b;
		System.out.println("Addition : "+ c);
		}
	public void add(int a , int b) {
		int c = a+b;
		System.out.println("Addition : "+ c);
	}
	public void add(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("Addition : "+ d);
		}
	public void add(double a, int b) {
		double c = a+b;
		System.out.println("Addition : "+ c);
	}
	public void add(double a, double b) {
		double c = a+b; 
		System.out.println("Addition ; "+ c);
	}
	public int add(int a , int b , int c, int d) {
		int e = a+b+c+d;
		return e;
	}
}
