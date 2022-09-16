package in.com.raystec.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializationExternalizableIntface{
	public static void main(String[] args) throws IOException {
		
	
	FileOutputStream file = new FileOutputStream("D:\\ExternalizableIntface.ser");//bytes
	ObjectOutputStream out = new ObjectOutputStream(file);//object
	
	
	ExternalizableIntface ta = new ExternalizableIntface();
	ta.setName("Ram");
	ta.setMaths(80);
	ta.setPhysics(70);
	ta.setChemistry(85);
	ta.setId("123456");
	
	out.writeObject(ta);
	System.out.println("Done");
	
	file.close();
	out.close();
	
}

}