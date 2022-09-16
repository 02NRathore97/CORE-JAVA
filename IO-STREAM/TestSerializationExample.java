package in.com.raystec.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


//write the object

public class TestSerializationExample {
public static void main(String[] args) throws IOException {
	FileOutputStream file = new FileOutputStream("D:\\Serailization.ser");//bytes
	ObjectOutputStream out = new ObjectOutputStream(file);//object
	
	
	SerializationExample s = new SerializationExample();
	s.setName("Ram");
	s.setMaths(80);
	s.setPhysics(70);
	s.setChemistry(85);
	
	out.writeObject(s);
	System.out.println("Done");
	
	file.close();
	out.close();
	
	
	
}

}
