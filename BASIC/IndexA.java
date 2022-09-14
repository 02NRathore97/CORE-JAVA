package in.com.raystec.String;

public class IndexA {

	public static void main(String[] args) {
		String name = "Vijay Dinanath Chouhan";
		/*for(int i = name.length()-1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}*/
		/*int count = 0;
		for(int i = 0; i <= name.length()-1; i++) {
			if(name.charAt(i) == 'a') {
				count+= 1;
			}
			
		}
		System.out.println(count);
		
	}*/
		String name1 = "java";
	int count1 = 0;
	int count2 = 0;
	int count3 = 0;
	for(int i = 0; i <= name1.length()-1; i++) {
		if(name1.charAt(i) == 'j') {
			count1+= 1;
		}
		if(name1.charAt(i) == 'a') {
			count2+= 1;
		}
		if(name1.charAt(i) == 'v') {
			count3+= 1;
		}
		
	}
	System.out.println( "j = " +count1);
	System.out.println( "a = " +count2);
	System.out.println( "v = " +count3);
	
}

}
