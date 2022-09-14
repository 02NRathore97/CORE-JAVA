package in.com.raystec.inheritance;

public class Triangle extends Shape {
//attributes
private int base = 0;
private int heigth = 0;

//getter
public int getBase() {
	return base;
}
public int getHeigth() {
	return heigth;
}

//setter
public void setBase(int base) {
	this.base = base;
}

public void setHeigth(int heigth) {
	this.heigth = heigth;
}

public void area() {
	double a = (base*heigth)/2;
	System.out.println("The area of the triangle is : "+ a);
	
}

}
