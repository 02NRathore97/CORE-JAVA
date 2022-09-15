package in.com.raystec.IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
public static void main(String[] args) throws IOException {
	FileWriter writer = new FileWriter("D:\\Java.txt");
	PrintWriter pw = new PrintWriter(writer);
	pw.println("Neeraj");
	System.out.println("DONE");
	pw.close();
	writer.close();
}
}
