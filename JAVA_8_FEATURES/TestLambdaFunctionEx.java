package in.com.raystec.java_8_features;

public class TestLambdaFunctionEx {
public static void main(String[] args) {
	//LambdaFunctionEx l = new LambdaFunctionEx() {
		//public  void show() {
			//System.out.println("Hello");
		//}
	//};
	//l.show();
	
	
	//By using lambda expression
	LambdaFunctionEx l = ()->{
		System.out.println("Hello");
	};
	l.show();
}
}
