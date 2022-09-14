package in.com.raystec.basics;

public class Automobile {
	
	//attributes
	private String color;
	private int speed;
	private String make;
	
	//setters
	public void setColor(String color) {
		this.color = color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	
	//getters
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	public String getMake() {
		return make;
	}
	
	//methods
	public int break1() {
		speed = speed-speed;
		return speed;
		}
	
	
	public void changeGear(int gear) {
		int i = gear;
		int a =  speed+10;
		int b =  a+10;
		int c =  b+10;
		int d =  c+10;

		if (i == 1) {
			System.out.println("Speed is = " +a + " kp/h");
		} else if (i == 2) {
			System.out.println("Speed is  =" + b + " kp/h");
		} else if (i == 3) {
			System.out.println("Speed is " + c + " kp/h");
		} else if (i == 4) {
			System.out.println("Speed is " + d + " kp/h");
		} else {
			System.out.println("Speed is 34 kp/h");
		}
	}
	
	
	public void accelerator() {
		int s = getSpeed()+10;
		System.out.println("Now speed is : " + s);
			
	  }
	}
	
	
	

