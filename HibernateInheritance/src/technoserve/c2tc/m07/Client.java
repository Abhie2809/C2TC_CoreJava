package technoserve.c2tc.m07;

import technoserve.c2tc.m07.entity.C2TC_batch;
import technoserve.c2tc.m07.entity.Student;
import technoserve.c2tc.m07.service.StudentService;
import technoserve.c2tc.m07.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service= new StudentServiceImpl();
		C2TC_batch student=new C2TC_batch();//upcasting
		student.setUid(2100805);
		student.setName("Harshitha");
		student.setTech_trainer("Sanjana");
		student.setSoftskill_trainer("Nitara");
		service.addStudent(student);
		
		
		
		

	}

}
