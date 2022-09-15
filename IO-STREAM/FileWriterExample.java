package in.com.raystec.IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
public static void main(String[] args) throws IOException {
	FileWriter writer = new FileWriter("D:\\Java.txt");
	writer.write(56);
	System.out.println("DONE");
	writer.close();
}
}
