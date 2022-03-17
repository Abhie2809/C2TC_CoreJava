package technoserve.c2tc.m07;

import java.io.*;

public class Main1 {
	public static void main(String args[]){
		try{
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("file.txt"));
			Student s=(Student)in.readObject();
			System.out.println(s.id+" "+s.name);
			
			in.close();
			}
		
		catch(Exception e){
			System.out.println(e);
			}

}
}