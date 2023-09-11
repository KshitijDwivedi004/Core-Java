package com.kshitij.io5.bufferredReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		reader
		File dir = new File("kdJava");
		File file = new File(dir,"kdJava.txt");
		
		FileReader fr = new FileReader(file);
		 BufferedReader br = new BufferedReader(fr);
		 
		 String line = br.readLine();
		 while(line != null) {
			 System.out.println(line);
			 line = br.readLine();
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		writer
//		File dir = new File("kdJava");
//		File file = new File(dir,"kdJava.txt");
		
//		FileWriter fw = new FileWriter(file,true);
//		BufferedWriter bw = new BufferedWriter(f);
//		
//		bw.write("Leonel");
//		bw.newLine();
//		bw.write("Messi");
//		bw.newLine();
//		char ch[]= {'R','a','m','p','a','g','e'};
//		bw.write(ch);
//		bw.newLine();
//		
//		bw.close();
//		System.out.println("Written SuccessFully");
		
		
		
	}

}
