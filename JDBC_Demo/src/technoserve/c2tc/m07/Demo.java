package technoserve.c2tc.m07;

import java.sql.*;

public class Demo {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/m07";
		String user="root";
		String pass="root";
		String query="SELECT * FROM m07.details;";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url, user, pass);
		Statement st =con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
		System.out.println("UID of the Student is "+rs.getInt(1));
		System.out.println("Name of the Student is "+rs.getString(2));
		}
		st.close();
		con.close();
		

	}

}
