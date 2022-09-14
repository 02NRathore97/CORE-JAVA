package in.com.raystec.conversions;

public class OtherDataType_To_String {
public static void main(String[] args) {
	int a = 5;
	// String s = a;     it will give an error
	String s = String.valueOf(a);
	System.out.println(s);
}
}
