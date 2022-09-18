package in.com.raystec.multithreading;

public class DaemonThreadExample extends Thread {
public void run() {
	System.out.println("Daemon T started"+ Thread.currentThread());
	
	while(true) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public static void main(String[] args) {
	System.out.println("Main Started");
	
	DaemonThreadExample t = new DaemonThreadExample();
	t.setDaemon(true);
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Leaving main method");
	System.out.println("Now jvm will exit");
}
}
