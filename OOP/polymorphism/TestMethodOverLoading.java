package in.com.raystec.polymorphism;

public class TestMethodOverLoading {
	public static void main(String[] args) {
		
MethodOverLoading m = new MethodOverLoading();
	
m.add();  //no arguments + no return type
m.add(5,6); //two int  arguments + no return type
m.add(5,7, 8);//three int arguments + no return type
m.add(5,6,7,8);//four arguments + no return type
m.add(5,8);//one double,  one int + no return type
int i = m.add(6,8,9,5);//four arguments + return type

System.out.println("Addition : "+i);
	}
}
