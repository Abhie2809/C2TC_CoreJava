package technoserve.c2tc.m07.dao;

import technoserve.c2tc.m07.entity.Student;

public interface StudentDao{
	
	void addStudent(Student student);

	void startTransaction();

	void endTransaction();

	void updateStudent(Student student);

	Student getStudent(int uid);

	void removeStudent(int uid);
	

}
