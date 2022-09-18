package in.com.raystec.multithreading;

public class RaceConditionAccount {
	//attributes
private int balance = 0;


//setter/getter

public int getBalance() {
	
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	return balance;
}
public void setBalance(int balance) {
	
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	this.balance = balance;
}




	/*public synchronized void deposite( String name, int amount){//method synchronized
	int bal = getBalance()+amount;
	setBalance(bal);
	System.out.println( name +" 1000"+"   :   balance is "+getBalance());
}*/

public void deposite(  String name,int amount) {
	synchronized(this) {//Block synchronized
		int bal = getBalance()+amount;
		setBalance(bal);
		System.out.println( name +" 1000"+"   :   balance is "+getBalance());
	}
}
}




