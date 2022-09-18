package in.com.raystec.multithreading;

public class SleepExample extends Thread {
	//attributes
		private String name = null;
		
		//constructor
		public SleepExample(String n) {
			this.name = n;
		}
		public void run() {
			for(int i = 0; i<50; i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		//milliseconds    , 1000 millisec = 1sec 
			System.out.println(i +" : "+ name);	
			}
		}
		
	public static void main(String[] args) {
		
		SleepExample t1 = new SleepExample("Ram");
		SleepExample t2 = new SleepExample("Shayam");
		
		int i = t1.getPriority();
		System.out.println(i);
		
		t1.setPriority(9);
		
		t1.start();
		t2.start();
		
	}
}
