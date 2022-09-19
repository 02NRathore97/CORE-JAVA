package in.com.raystec.java_8_features;

public interface Default_and_Static_Method {
	
	//in interface we can not give the definition of method but in static and default method we can give definition
	
	//Default method
	public default void show() {
		System.out.println("This is default method");
	}
	
	//static method
	public static void print() {
		System.out.println("This is static method");
	}
}
