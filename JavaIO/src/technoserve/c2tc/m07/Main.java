package technoserve.c2tc.m07;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
	static final String FILEPATH ="file.txt";
	public static void main(String[] args) {
		try {
			System.out.println(new String(readFromFile(FILEPATH, 0, 18)));
			writeToFile(FILEPATH, "I love my country and my people", 31);
			} 
	    catch (IOException e) {
	    	e.printStackTrace();
	     }
		}
private static byte[] readFromFile(String filePath, int position, int size)
		throws IOException {
	RandomAccessFile file = new RandomAccessFile(filePath, "r");
	file.seek(position);
	byte[] bytes = new byte[size];
	file.read(bytes);
	file.close();
	return bytes;
	}

private static void writeToFile(String filePath, String data, int position)
		throws IOException {
	RandomAccessFile file = new RandomAccessFile(filePath, "rws");
	file.seek(position);
	file.write(data.getBytes());
	file.close();
	}
}
