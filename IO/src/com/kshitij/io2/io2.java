package com.kshitij.io2;
import java.io.*;
public class io2 {
 public static void main(String args[]) {
	 
	 File dir= new File("kdJava");
	 System.out.println("dir is refering to directory kdJava "+dir.isDirectory());
	 dir.mkdir();
	 
	 File file2 = new File(dir,"kdJava.txt");
	 try {
		file2.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.println("file is refering to kdJava.txt "+file2.isFile());
	 
	 
	 
	 int count=0;
	 File f1 = new File("D:\\JAVAeclipse");
	 String str[]= f1.list();
	 
	 for(String name: str) {
		 count++;
		 System.out.println(name);
	 }
	 System.out.println("No. of files are "+ count);
	 
 }
}
