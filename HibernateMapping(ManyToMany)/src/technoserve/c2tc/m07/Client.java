package technoserve.c2tc.m07;

import technoserve.c2tc.m07.entity.Laptop;
import technoserve.c2tc.m07.entity.Student;
import technoserve.c2tc.m07.service.StudentService;
import technoserve.c2tc.m07.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service= new StudentServiceImpl();
		Student student=new Student();
		Laptop laptop1 =new Laptop();
		Laptop laptop2 =new Laptop();
		student.setUid(2100810);
		
		student.setName("Surendra");
		laptop1.setLid(1);
		laptop1.setLname("HP");
		laptop2.setLid(2);
		laptop2.setLname("Lenovo");
		student.getLaptop().add(laptop1);
		student.getLaptop().add(laptop2);
		service.addLaptop(laptop1);
		service.addLaptop(laptop2);
		service.addStudent(student);
		
		
		
		

	}

}
