package com.kshitij.io3;
import java.io.*;

public class io3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File("kdJava");
		File file = new File(dir,"kdJava.txt");
		
		file.createNewFile();
		
		FileWriter fw = new FileWriter(file,true);// true for saving data
		
		fw.write("kd");
		fw.write('\n');
		fw.write(65);
		fw.write(97);
		char ch[]= {'J','A','V','A'};
		fw.write(ch);
		fw.write('\n');
		
		fw.close(); // important to close to write data
		
		System.out.println("open kd.txt to see effects");
		
	}

}
