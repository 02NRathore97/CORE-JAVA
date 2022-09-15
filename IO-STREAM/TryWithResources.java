package in.com.raystec.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
public static void main(String[] args) throws IOException {
	
	//Before java 9 we have to close the object 
	String source = "D:\\Java.txt";
/*	FileReader reader  = null;
	try {
		 reader = new FileReader(source);
		 int ch = reader.read();
		 while(ch!=-1) {
			char c = (char)ch;
			System.out.print(c);
			ch = reader.read();
		 }
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		reader.close();
	}
*/
	
	//But after java 9 we do not need to close the object, we have 
	try(FileReader reader = new FileReader(source)){
		int ch = reader.read();
		while(ch!=-1) {
			char c = (char)ch;
			System.out.print(c);
			ch = reader.read();
			
		}
	} 
	
	
}
}
