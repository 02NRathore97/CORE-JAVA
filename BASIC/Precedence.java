package in.com.raystec.operator;

public class Precedence {
public static void main(String[] args) {
	int i= 0;
	System.out.println(++i + ++i + i++);//5
	int k = 0;
	System.out.println(k++ + k + k++ + ++k + k++);//8
	int j = 0;
	System.out.println(++j + ++j + j++ + ++j + j++ + ++j);//19
}
}
