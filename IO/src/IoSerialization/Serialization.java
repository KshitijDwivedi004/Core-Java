package IoSerialization;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer implements Serializable{
	private String name;
	private int age;
	private int runs;
	public Cricketer(String name, int age, int runs) {
		super();
		this.name = name;
		this.age = age;
		this.runs = runs;
	}
	
	
}

public class Serialization {
	public static void main(String args[]) throws IOException {
		
		Cricketer c = new Cricketer("Kshitij", 18, 142);
		
		File f2 = new File("kd2");
		f2.mkdir();
		File f3 = new File(f2,"java.txt");
		f3.createNewFile();
		
		FileOutputStream fos = new FileOutputStream("java.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(c);
		
		oos.close();
		
		
	}
}
