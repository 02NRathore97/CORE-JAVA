package in.com.raystec.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class TestDeserializationExample {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	//read object
	FileInputStream file = new FileInputStream("D:\\Serailization.ser");
	ObjectInputStream in = new ObjectInputStream(file);
	
	SerializationExample s = new SerializationExample();
	s = (SerializationExample)in.readObject();
	System.out.println(s.getName());
	System.out.println(s.getMaths());
	System.out.println(s.getPhysics());
	System.out.println(s.getChemistry());
	
	file.close();
	System.out.println("Done");
}
}
