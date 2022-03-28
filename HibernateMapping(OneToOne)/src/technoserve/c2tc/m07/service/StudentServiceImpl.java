package technoserve.c2tc.m07.service;

import technoserve.c2tc.m07.dao.*;
import technoserve.c2tc.m07.dao.StudentDaoImpl;
import technoserve.c2tc.m07.entity.Laptop;
import technoserve.c2tc.m07.entity.Student;

public class StudentServiceImpl implements StudentService {
	
	StudentDao sd;
	public StudentServiceImpl(){
		sd=new StudentDaoImpl();
	}
	@Override
	public void addStudent(Student student) {
		sd.startTransaction();
		sd.addStudent(student);
		sd.endTransaction();
	}
	@Override
	public void updateStudent(Student student) {
		sd.startTransaction();
		sd.updateStudent(student);
		sd.endTransaction();
		
	}
	@Override
	public Student getStudent(int uid) {
		Student s = sd.getStudent(uid);
		return s;
	}
	@Override
	public void deleteStudent(int uid) {
		sd.startTransaction();
		sd.removeStudent(uid);
		sd.endTransaction();
		
	}
	@Override
	public void addLaptop(Laptop laptop) {
		sd.startTransaction();
		sd.addLaptop(laptop);
		sd.endTransaction();
		
	}

}
