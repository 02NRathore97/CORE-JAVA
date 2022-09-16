package in.com.raystec.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserializationExternalizableIntface {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	//read object
		FileInputStream file = new FileInputStream("D:\\ExternalizableIntface.ser");
		ObjectInputStream in = new ObjectInputStream(file);
		
		ExternalizableIntface ta = new ExternalizableIntface();
		ta = (ExternalizableIntface)in.readObject();
		System.out.println(ta.getName());
		System.out.println(ta.getMaths());
		System.out.println(ta.getPhysics());
		System.out.println(ta.getChemistry());
		System.out.println(ta.getId());
		
		file.close();
		System.out.println("Done");
}
}
