package Activity1;

import java.io.*;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("file_1.txt");
		
		fw.write("Data From File1");
		 fw.close();
		 
		FileReader fr = new FileReader("file_1.txt");
		Scanner freader = new Scanner(fr);
		String s = "";
		while(freader.hasNextLine())
		{
			s+=freader.nextLine();
		}
		freader.close();
		System.out.println(s);
		FileWriter fw2 = new FileWriter("file_2.txt");
		
		fw2.write(s);
		fw2.close();		
		
		

	}

}
