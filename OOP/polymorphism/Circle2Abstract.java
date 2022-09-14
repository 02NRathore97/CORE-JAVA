package in.com.raystec.polymorphism;
//if you do not define the abstract method in this class  then this class should also be abstract
//and the child class of this class will have to define this method
public  class Circle2Abstract extends Shape2Abstract{

	//attributes
	private int radius = 0;
	


	//constructor
	public Circle2Abstract(int radius) {
		this.radius = radius;
	}

	


	
	//if this method is defined then there is no need to make this class abstract
	public void area() {   
		double a = PI*radius*radius;
		System.out.println("Area of the circle is : "+ a);
	}
	
	
}
