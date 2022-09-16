package in.com.raystec.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestTransientDeserializationAttributes {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	//read object
	FileInputStream file = new FileInputStream("D:\\TransientAttributes.ser");
	ObjectInputStream in = new ObjectInputStream(file);
	
	TransientAttributes ta = new TransientAttributes();
	ta = (TransientAttributes)in.readObject();
	System.out.println(ta.getName());
	System.out.println(ta.getMaths());
	System.out.println(ta.getPhysics());
	System.out.println(ta.getChemistry());
	System.out.println(ta.getId());
	
	file.close();
	System.out.println("Done");
}
}
