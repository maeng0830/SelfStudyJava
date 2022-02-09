package sec02.test02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AddLineNumberExample {

	public static void main(String[] args) throws IOException {
		String filePath = "src/sec02/test02/AddLineNumberExample.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int num = 0;
		
		while(true) {
			num += 1;
			String data = br.readLine();
			if(data == null) { break; }
			System.out.println(num + ": " + data );
		}

	}

}
