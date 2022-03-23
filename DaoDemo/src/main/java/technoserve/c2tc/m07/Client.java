package technoserve.c2tc.m07;

public class Client {

	public static void main(String[] args) throws Exception {
		Student s= new Student();
		s.setUid(2110624);
		s.setName("Yogesh");
		StudentDao sd=new StudentDao();
		sd.addStudent(s);
		Student s1=sd.getStudent();
		System.out.println(s1);
	}

}
