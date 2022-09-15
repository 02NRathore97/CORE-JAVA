package in.com.raystec.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
public static void main(String[] args) throws IOException{
	 //creating the object of FileReader class
	FileReader in = new FileReader("D:\\Java.txt");
	int ch = in.read();//read the file
	while(ch!= -1) {
		char c = (char)ch;//typecast
		System.out.println(c);
		ch = in.read();
	}
}
}
