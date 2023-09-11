package com.kshitij.io;
import java.io.*;
public class IOoperations {
	public static void main(String args[] ) throws IOException {
		File file1= new File("pw.txt");
		
//		System.out.println(file1.exists()); //false
		
		file1.createNewFile();
		System.out.println(file1.exists()); //True
		
		File dir = new File("pw");
//		System.out.println(dir.exists());
		
		dir.mkdir();
		System.out.println(dir.exists());
		
		
	}

}
