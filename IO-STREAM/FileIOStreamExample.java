package in.com.raystec.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FileIOStreamExample {
public static void main(String[] args) throws IOException {
	String source = "D:\\Image.jpg";
	String target = "D:\\Image1.jpg"; 
	FileInputStream reader = new FileInputStream(source);
	FileOutputStream writer = new FileOutputStream(target);
	
	int line = reader.read();
	while(line!=-1) {
		
		writer.write(line);
		line = reader.read();
	}
	writer.close();
	reader.close();
	System.out.println("DONE");
	
}
}
