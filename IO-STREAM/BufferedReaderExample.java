package in.com.raystec.IOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
public static void main(String[] args) throws IOException {
	String source = "D:\\Java.txt";
	FileReader reader = new FileReader(source);//creating object of FileReader class
	BufferedReader in = new BufferedReader(reader);//creating object of BufferedReader class
	String line = in.readLine();
	while(line!=null) {
	System.out.println(line);	
	line = in.readLine();
	}
	in.close();
	reader.close();
}
}
