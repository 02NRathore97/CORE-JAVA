package in.com.raystec.methods;

public class Methods {
		public void add() {
			int a = 5;
			int b = 10; 
			int c = a + b;
			System.out.println("The sum of a and b = " + c);
		}
		public void subs() {
			int a = 5;
			int b = 10; 
			int c = a - b;
			System.out.println("The sum of a and b = " + c);
		}
		public void mult() {
			int a = 5;
			int b = 10; 
			int c = a * b;
			System.out.println("The sum of a and b = " + c);
		}
		public void div() {
			int a = 10;
			int b =5; 
			int c = a / b;
			System.out.println("The sum of a and b = " + c);
		}
		public void sInterest() {
			int p = 5000;
			int t = 2; 
			int r = 5;
			int si = (p*t*r)/100;
			System.out.println("The sum of a and b = " + si);
		}
	public static void main(String[] args) {
		Methods a = new Methods();
		a.add();
		a.subs();
		a.mult();
		a.div();
		a.sInterest();
		
	}
}
