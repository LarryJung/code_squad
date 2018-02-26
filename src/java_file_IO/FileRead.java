package java_file_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("/Users/chaegyunjung/Desktop/out2.txt"));
		String line = null;
		while ((line = br.readLine())!= null) {
			
			System.out.println(line);
		}
		br.close();
	}
}
