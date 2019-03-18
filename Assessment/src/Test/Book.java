package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Book {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
				
				while(true)
				{
					System.out.println("Enter 1	Display all books\n" +"Enter 2 for Add new Book Entry\n" + "Enter 3 for Exit\n"); 
							
					int option = sc.nextInt();
					
					switch(option)
					{
						case 1 :
							displaybooks();;
							break;
						case 2 :
							addnewbook();
							break;
						case 3 :
							System.exit(0);
							break;
							default:
								System.out.println("Enter correct option");
							
					}
				}
	}

	private static void addnewbook() {
		// TODO Auto-generated method stub
		try
		{
		Connection con = createConnection();
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the BookId");
		int BookId = s.nextInt();
		System.out.println("Please enter the BookName");
		String BookName = s.next();
		System.out.println("Please enter the AuthorName");
		String AuthorName = s.next();
		String sql = "insert into db21.Book values(?,?,?)";
		
		String sql1 = "Select * from db21.Book where BookName=";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1,BookName);
		ResultSet rs = pstmt.executeQuery();
		pstmt.setInt(1,BookId);
		pstmt.setString(2,BookName);
		pstmt.setString(3,AuthorName);
		int rows =pstmt.executeUpdate();
		System.out.println("No of affected rows " + rows);
		pstmt.close();
		con.close();
		
}
		
		
	
		catch(SQLException e)
		{
			
			e.printStackTrace();
		}
	}
	
		
	private static void displaybooks() {
		// TODO Auto-generated method stub
		try
		{
	
			Connection con = createConnection();
			String sql = "select * from db21.Book";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println("BookId=" + rs.getInt(1) + "BookName"+ rs.getString(2)+"AuthorName"+rs.getString(3));
			}
			rs.close();
			pstmt.close();
			con.close();
					
	}
		catch(SQLException e)
		{
			
			e.printStackTrace();
		}

	}	
		
	

	private static Connection createConnection() {
		// TODO Auto-generated method stub
		try
		{
		
Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db21", "root", "AKHILKATTI01");
		return con;
	}
	catch(ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
		
	}
		return null;
		
}
		
	
	}

	
	
	
	

