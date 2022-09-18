package in.com.raystec.multithreading;

public class ThreadPriorityExample  extends Thread{
	//attributes
	private String name = null;
	
	//constructor
	public ThreadPriorityExample(String n) {
		this.name = n;
	}
	public void run() {
		for(int i = 0; i<50; i++) {
		System.out.println(i +" : "+ name);	
		}
	}
	
public static void main(String[] args) {
	
	ThreadPriorityExample t1 = new ThreadPriorityExample("Ram");
	ThreadPriorityExample t2 = new ThreadPriorityExample("Shayam");
	
	int i = t1.getPriority();
	System.out.println(i);
	
	t1.setPriority(9);
	
	t1.start();
	t2.start();
	
}
}
