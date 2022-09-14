package in.com.raystec.String;

public class StringMethods {
	public static void main(String[] args) {
		String name = "Viajy Dinanath Chouhan";
		
		System.out.println("String lenght = " + name.length());
		System.out.println("charater at 7th place is  = " + name.charAt(6));
		System.out.println("index of i is  = " + name.indexOf('i'));
		System.out.println("last index of i is  = " + name.lastIndexOf('i'));
		System.out.println("replace a with b = " + name.replace("a","b"));
		System.out.println("name is in lower case = " + name.toLowerCase());
		System.out.println("name is in Upper case" + name.toUpperCase());
		System.out.println("String starts with = " + name.startsWith("Viaj"));
		System.out.println("String ends with = " + name.endsWith("han"));
		System.out.println("String substring = " + name.substring(6));
	}
}
