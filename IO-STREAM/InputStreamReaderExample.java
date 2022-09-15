package in.com.raystec.IOStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReaderExample {
public static void main(String[] args) throws IOException {
	String target = "D:\\Java.txt";
	FileWriter writer = new FileWriter(target);
	PrintWriter pw = new PrintWriter(writer);
	
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(reader);
	
	System.out.println("DONE");
	
	String line = in.readLine();
	while(!line.equals("end")) {
	
		
		pw.println(line);
		line = in.readLine();
		System.out.println(line);
		}
	pw.close();
	reader.close();
}
}
