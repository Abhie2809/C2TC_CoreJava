package technoserve.c2tc.m07;

import java.sql.*;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();//"Ganavi Ganavi Gowda BS";
		int uid=sc.nextInt();// 2100804;
		String url="jdbc:mysql://localhost:3306/m07";
		String user="root";
		String pass="root";
		//String query="INSERT INTO `m07`.`details` VALUES"+ "("+uid+", "+name+");";
		//String query="UPDATE `details` SET `name` = 'Ganavi Gowda BS' WHERE (`uid` = '2100804');";
		//String query="DELETE FROM `details` WHERE (`uid` = '123');";
		String query="INSERT INTO `m07`.`details` VALUES(?,?);";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url, user, pass);
		//Statement st =con.createStatement();
		PreparedStatement st =con.prepareStatement(query);
		st.setInt(1, uid);
		st.setString(2, name);
		int rs = st.executeUpdate();
		System.out.println("no of rows updated is "+rs);
		st.close();
		con.close();
		

	}

}
