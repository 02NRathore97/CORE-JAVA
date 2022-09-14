package in.com.raystec.String;

public class CopyArray {
	public static void main(String[] args) {
		char[] copyFrom = {'a','b','c','d','e','f','g','h','i'};
		char[] copyTo = new char[8];
		System.arraycopy(copyFrom, 2, copyTo, 0, 5);
		System.out.println(new String( copyTo));
	}
}
