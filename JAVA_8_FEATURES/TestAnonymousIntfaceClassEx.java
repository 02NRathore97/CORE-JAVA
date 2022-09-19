package in.com.raystec.java_8_features;

public class TestAnonymousIntfaceClassEx{
public static void main(String[] args) {
	
	//AnonymousClassExample a = new AnnymousClassExample();  //it is not allowed
	
	//for instantiate the AnonymousClassExample we have to override it her
	
	AnonymousClassExample a = new AnonymousClassExample() {
		public void help() {
			System.out.println("Help to others");
		}
	};
	a.help();
 }
}
