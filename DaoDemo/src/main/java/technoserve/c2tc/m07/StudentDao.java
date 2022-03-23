package technoserve.c2tc.m07;

import java.sql.*;

public class StudentDao {
	
	public void addStudent(Student s) throws Exception {
		String url="jdbc:mysql://localhost:3306/m07";
		String user="root";
		String pass="root";
		String query="INSERT INTO `m07`.`details` VALUES(?,?);";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url, user, pass);
		PreparedStatement st =con.prepareStatement(query);
		st.setInt(1, s.getUid());
		st.setString(2, s.getName());
		int rs = st.executeUpdate();
		st.close();
		con.close();
		
	}
	public Student getStudent() {
		// TODO Auto-generated method stub
		return null;
	}
}
