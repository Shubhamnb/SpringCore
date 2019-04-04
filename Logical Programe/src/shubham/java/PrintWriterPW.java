package shubham.java;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterPW {

	public static void main(String[] args) {
		try {
		PrintWriter pw =new PrintWriter(new File("/home/admin3/Shubham/file.txt"));
		
		pw.write("Shubham Bohari java");
		//pw.flush();
		pw.close();
		}
		catch (Exception e) {
			System.out.println("File not found");
		}
	}

}
