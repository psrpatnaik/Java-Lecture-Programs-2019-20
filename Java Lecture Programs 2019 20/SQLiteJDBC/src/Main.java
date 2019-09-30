import java.sql.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		Class.forName("org.sqlite.JDBC"); //1
		// 2
		con=DriverManager.getConnection("jdbc:sqlite:E:\\students.db");
		// 3
		
		Statement stmt= con.createStatement();
		
		ResultSet rs=stmt.executeQuery("SELECT * FROM student");
		
		//4
		
		while(rs.next()) {
			System.out.print("Roll:"+rs.getString("std-roll")+"  ");
			System.out.print("Name:"+rs.getString("std-name")+"  ");
			System.out.print("Age:"+rs.getString("std-age")+"  ");
			System.out.println();
		}
		
		//5
		
		//
		stmt.executeUpdate("INSERT INTO student VALUES(99,'Zain',29)");
		
		stmt.close();
		con.close();
		
	}

}
