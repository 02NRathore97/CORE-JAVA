package in.com.raystec.multithreading;

public class WithoutThreadExample extends Thread {
	
	//attribute
	String name = null;
	
	//constructor
	public WithoutThreadExample(String n) {
		name = n;
	}
	
	public void run() {
		for(int i = 0; i<50; i++) {
		System.out.println(i+" "+name);	
		}
	}
public static void main(String[] args) {
	WithoutThreadExample w = new WithoutThreadExample("Ram");
	WithoutThreadExample w1 = new WithoutThreadExample("Lakhan");
	
	w.start();
	w1.start();
}

}
