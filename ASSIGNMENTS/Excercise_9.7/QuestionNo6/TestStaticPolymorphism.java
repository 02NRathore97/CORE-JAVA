package in.com.raystec.QuestionNo6;

public class TestStaticPolymorphism {


		public static void main(String[] args) {
			
			StaticPolymorphism s= new StaticPolymorphism();
				
		s.add();  //no arguments + no return type
		s.add(5,6); //two int  arguments + no return type
		s.add(5,7, 8);//three int arguments + no return type
		s.add(5,6,7,8);//four arguments + no return type
		s.add(5,8);//one double,  one int + no return type
		int i =s.add(6,8,9,5);//four arguments + return type

			System.out.println("Addition : "+i);
				}

	}


