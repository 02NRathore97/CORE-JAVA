package in.com.raystec.multithreading;

public class RaceCondition extends Thread{
	 RaceConditionAccount r = new RaceConditionAccount();
	//attribute
	String name = null;
	
	//constructor
	public RaceCondition(String name) {
		this.name = name;
	}
	
	
	public void run() {
		for(int i=0; i<5;i++) {
			r.deposite(name, 1000);
			
	}
  }
	public static void main(String[] args) {
		RaceCondition r1 = new RaceCondition("Ram");
		RaceCondition r2 = new RaceCondition("Shayam");
		
		r1.start();
		r2.start();
	}
}
	

