package in.com.raystec.basics;

public class AutomobileTest {
	public static void main(String[] args) {
		//creating object of an automobile class
		Automobile am = new Automobile();
		
		//set values
		am.setColor("yellow");
		am.setSpeed(60);
		am.setMake("2010");
		
		//get values
		System.out.println("color = " + am.getColor());
		System.out.println("Speed = " + am.getSpeed() + " km/h");
		System.out.println("Make = " + am.getMake());
		
		//method calling
		
	//int i = am.break1();
	//System.out.println("After applying break speed is  : " +i);
		
	System.out.print("After acceleration : " );
	am.accelerator();
	
		
	System.out.print("After changing gear : " );
		am.changeGear(4);
	

}
	}