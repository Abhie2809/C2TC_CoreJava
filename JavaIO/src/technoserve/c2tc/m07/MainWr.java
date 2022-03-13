package technoserve.c2tc.m07;

import java.io.*;

public class MainWr {
	public static void main(String[] args) {
		try {
			
			Writer w = new FileWriter("file.txt");
			String content = "I love my country";
			w.write(content);
			w.close();
			System.out.println("Done");
			}
		catch (IOException e) {
			e.printStackTrace();
			}
		}

	}