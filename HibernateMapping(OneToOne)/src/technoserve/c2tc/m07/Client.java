package technoserve.c2tc.m07;

import technoserve.c2tc.m07.entity.Laptop;
import technoserve.c2tc.m07.entity.Student;
import technoserve.c2tc.m07.service.StudentService;
import technoserve.c2tc.m07.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service= new StudentServiceImpl();
		Student student=new Student();
		Laptop laptop =new Laptop();
		student.setUid(2100810);
		student.setName("Surendra");
		laptop.setLid(1);
		laptop.setLname("HP");
		student.setLaptop(laptop);
		service.addLaptop(laptop);
		service.addStudent(student);
		
		
		
		

	}

}
