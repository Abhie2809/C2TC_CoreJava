package technoserve.c2tc.m07;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("technoserve.c2tc.m07.Student");
		Student.display();

	}

}
