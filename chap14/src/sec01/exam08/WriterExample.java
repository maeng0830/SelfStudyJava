package sec01.exam08;

import java.io.*;

public class WriterExample {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		char[] array = { 'a', 'b', 'c' };
		
		writer.write(array);
		
		writer.flush();
		writer.close();

	}

}
