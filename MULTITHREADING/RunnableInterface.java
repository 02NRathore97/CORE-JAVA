package in.com.raystec.multithreading;

public class RunnableInterface implements Runnable {
	//attributes
	private String name = null;
	
	//constructor
	public RunnableInterface(String n) {
		this.name = n;
	}
	
	

	@Override
	public void run() {
		for(int i=0 ;i<50; i++){
			System.out.println(i +" : "+ name);
		}
	}
public static void main(String[] args) {
		RunnableInterface r1 = new RunnableInterface("Ram");
		RunnableInterface r2 = new RunnableInterface("Shayam");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
}
}
