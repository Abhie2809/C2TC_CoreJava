package technoserve.c2tc.m07;

import technoserve.c2tc.m07.entity.Student;
import technoserve.c2tc.m07.service.StudentService;
import technoserve.c2tc.m07.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service= new StudentServiceImpl();
		Student student= new Student();
		student.setUid(2110611);
		student.setName("Nayana Randive");
		//service.addStudent(student);//persist
		//service.updateStudent(student);//merge
		/*Student s = service.getStudent(2110615);//find
		System.out.println(s);*/
		service.deleteStudent(2110615);//remove
		

	}

}
