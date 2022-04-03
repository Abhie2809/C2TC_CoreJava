package tnsif.c2tc.m07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import tnsif.c2tc.m07.entity.Branch;
import tnsif.c2tc.m07.entity.Student;
import tnsif.c2tc.m07.service.StudentService;
import tnsif.c2tc.m07.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) throws ParseException {
		Student student= new Student();
		StudentService service = new StudentServiceImpl();
		String datestring1 = "01-01-2000";
		String datestring2 = "01-12-2000";
		SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");
		Date date1= format.parse(datestring1);
		Date date2= format.parse(datestring2);
		student.setUid(2110801);
		student.setName("Akshatha");
		student.setTrainer_name("Sanjana");
		student.setMarks(99.8f);
		student.setDateofbirth(date1);
		student.setBranch(Branch.CSE);
		service.addStudent(student);
		//System.out.println(service.getcount());
		//System.out.println(service.getStudentbytrainername("Sanjana"));
		//System.out.println(service.getStudentintherangeofdate(date1,date2));
		List<Student>list=service.getAllStudents();
		//for(Student s:list)
		Iterator<Student> it=list.iterator();
		while(it.hasNext())
		System.out.println(it.next());
		
		

	}

}
