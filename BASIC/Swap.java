package in.com.raystec.methods;

public class Swap {
	//using third variable
		public void swap() {
				int a =  5;
				 int b = 7;
				int temp = 0;
				System.out.println("befor swpping   a = "+ a + " , b = "+ b  );
				temp = a;
				a = b;
				b = temp;
				System.out.println("after  swpping   a = "+ a + " , b = "+ b  );
				
			}
		//without using third variable
			public void swap1() {
				int a =  5;
				 int b = 7;
				
				System.out.println("befor swpping   a = "+ a + " , b = "+ b  );
				a = a* b;
				b = a/b;
				a = a/b;
				System.out.println("after  swpping   a = "+ a + " , b = "+ b  );
				
			}
			public static void main(String[] args) {
			
				Swap s = new Swap ();
				s.swap();
				s.swap1();
				
				
				
			}
	

	}

