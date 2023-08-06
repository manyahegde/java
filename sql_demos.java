package sql_demos;

import java.sql.*;
import java.util.*;

public class sql_demos
{
	public static void main(String[] args)
	{
		Connection cn;
		Statement st;
		ResultSet rs, rs1;
		ResultSetMetaData rsmd;
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("------Welcome to NMAM Institute of Technology------");
			System.out.println("Enter Database Name");
			String dbname = sc.next();
			System.out.println("Enter Password");
			String pass = sc.next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbname, "root", pass);
			st = cn.createStatement();
			DatabaseMetaData dm = cn.getMetaData();
			rs = dm.getTables(cn.getCatalog(), "%", "%", null);
			String sql = "select * from ";
			String sql1 = "";
			System.out.println("Database is " + dbname);
			System.out.println("-------------------------");
			System.out.println("Tables are");
			System.out.println("-------------------------");
			while (rs.next())
			{
				sql1 = "";
				System.out.println("-------Table Name: " + rs.getString(3) + "---------");
				sql1 = sql + rs.getString(3);
				rs1 = st.executeQuery(sql1);
				rsmd = rs1.getMetaData();
				System.out.println("Columns are ");
				System.out.println("Column Name\tColumn Type\tSize");
				for (int i = 1; i <= rsmd.getColumnCount(); i++)
				{
					System.out.println(rsmd.getColumnLabel(i) + "\t" + rsmd.getColumnTypeName(i)+ "\t" +rsmd.getColumnDisplaySize(i));
				}
				System.out.println("----------------------------------");
			}
			rs.close();
			cn.close();
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
