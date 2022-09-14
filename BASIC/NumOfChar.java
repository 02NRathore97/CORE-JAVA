package in.com.raystec.String;

public class NumOfChar {
	public static void main(String[] args) {
		String s = "Neeraj rathore";
		int count = 0;
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i) != ' ') {

			count+=1;
			
		}
		
		}
		System.out.println(count);
	}
}