package io4_reading;
import java.io.*;

public class Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File("kdJava");
		File file1 = new File(dir,"kdJava.txt");
		
		FileReader fd = new FileReader(file1);
		int i=fd.read();
//		System.out.print(i+"->");
//		System.out.println((char)i);
//		while(i !=  -1) {
//			i=fd.read();
//			System.out.print(i+"->");
//			System.out.println((char)i);
//			
//		}
		
		char ch[] = new char[(int)file1.length()];
		fd.read(ch);
		for(char data: ch) {
			System.out.print(data);
		}
		
		fd.close();
	}

}
