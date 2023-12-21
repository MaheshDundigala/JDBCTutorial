import java.sql.*;

import javax.swing.JOptionPane;

public class JDBC1 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
		String connectionUrl = "jdbc:sqlserver://MAHESH;database=IBANK;integratedSecurity=true;";
		Connection con = DriverManager.getConnection(connectionUrl);
		//System.out.println("successfully connected");
       // JOptionPane.showMessageDialog(null,"connected");
		Statement st=con.createStatement();
		//st.executeUpdate("create table dept (dID INT ,DName varchar(10))");
		//System.out.println("table created");
		//st.executeUpdate("insert into dept values(101,'hr')");
		//System.out.println("rows inserted");
		ResultSet rs=st.executeQuery("select acid,name from Amaster ");
		System.out.println(rs);
		while(rs.next()) {
		System.out.println(rs.getInt("acid")+ " " +rs.getString("Name"));
		}
		st.close();
	}
}