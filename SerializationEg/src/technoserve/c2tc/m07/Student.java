package technoserve.c2tc.m07;

import java.io.Serializable;

public class Student implements Serializable{
	int id;
	String name;
	public Student(int id, String name,int age) {
		this.id = id;
		this.name = name;
		}
}
