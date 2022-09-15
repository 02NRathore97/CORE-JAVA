package in.com.raystec.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadByScannerExample {
public static void main(String[] args) throws IOException {
	
	String source = "D:\\Java.txt";
	FileReader reader = new FileReader(source);
	Scanner sc = new Scanner(reader);
	while(sc.hasNext()) {
		String line = sc.nextLine();
		System.out.println(line);
			}
	reader.close();
}
}
