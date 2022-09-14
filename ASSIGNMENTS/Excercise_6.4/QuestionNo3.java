package in.com.raystec.exercise;

public class QuestionNo3 {
	public static void main(String[] args) {
		String name = "Vijay Dinanath Chouhan" ;
				int count = 0;
				char ch = 'a';
		for( int i  = 0;  i<name.length();  i++) {
				if(name.charAt(i)==ch) {
					count++;
				}
			}
			System.out.println("The number of  occurrence of  "+ ch + " = " + count );
	 
	}

}
