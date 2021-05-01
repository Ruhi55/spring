package com.demo.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class CrudExample  {

	public static void main(String[] args) throws SQLException
	
	
	{
		// TODO Auto-generated method stub
		
		
		
		int c,id;
		String name;
		int sal;
		boolean flag=true;
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		Scanner s=new Scanner(System.in);
		try
		{
			//Class.forName("jdbc.");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/snipe_community","root","root");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		do
		{
			System.out.println("Press 1 to add emp ");
			System.out.println("Press 2 to update emp ");
			
			System.out.println("Press 3 to getlist emp ");

			System.out.println("Press 4 to search emp ");
			System.out.println("Press 5 to delete emp ");
			System.out.println("Press 6 to exit");
            c=Integer.parseInt(s.next());



		
		switch(c)
		{
		case 1:
			System.out.println("enter id:");
			id=s.nextInt();
			System.out.println("enter name :");
			name=s.next();
			System.out.println("enter salary :");
			sal=s.nextInt();
			
			try
			{
				String query="insert into emp13 values('"+id+"','"+name+"','"+sal+"')";
				stmt=con.createStatement();
				stmt.executeUpdate(query);
				System.out.println("row inserted");
				 
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			break;
			
		case 2:
			 System.out.println("Enter id :");
			int  e_id=s.nextInt();
			 
			 try {
				 String query="update emp13 set sal=28000 where id='"+e_id+"'";
				 stmt=con.createStatement();
					int x=stmt.executeUpdate(query);
					System.out.println("row updated :"+x);
					 
				}
				catch(Exception e)
				{
					e.printStackTrace();
					
				}
			 break;
			 
			 
			 
		case 3:
			
			try
			{
			String query="select * from emp13";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next())
			{
				 int id1=rs.getInt(1);
				 String name1=rs.getString(2);
				 int sal1=rs.getInt(3);
				 System.out.print(id1+"\t");
				 System.out.print(name1+"\t");
				 System.out.println(sal1);
			}
			//System.out.println("row inserted");
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	
		break;
		
		case 4:
			
			System.out.println("Enter id");
			int ids=s.nextInt();
			try {
			String query="select * from emp13 where id='"+ids+"'";
			
			
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("row inserted");
			
			while(rs.next())
			{
				 int id2=rs.getInt(1);
				 String name2=rs.getString(2);
				 int sal2=rs.getInt(3);
				 System.out.print(id2+"\t");
				 System.out.print(name2+"\t");
				 System.out.println(sal2);
			}
			 
		}
		catch(Exception e3)
		{
			e3.printStackTrace();
			
		}
		break;
		case 5:
			System.out.println("enter id :");
			int id4=s.nextInt();
			try
			{
			
			stmt=con.createStatement();
			int y=stmt.executeUpdate("delete from emp13 where id='"+id4+"'");
			System.out.println("row deleted"+y);
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		case 6:
			
		 System.exit(1);
		break;
		default :
			System.out.println("default executed");
		
		

	rs.close();
	stmt.close();
	con.close();
	}

	System.out.println("do u wanna continue :");
	String s1=s.next();
	if(s1.equals("yes")||s1.equals("y"))
		flag=true;
	if(s1.equals("no")||s1.equals("n"))
			flag=false;
	
}
while(flag);

		
	
	}

}
