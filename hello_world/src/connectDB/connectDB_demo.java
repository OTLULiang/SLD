package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Random;

public class connectDB_demo {
		
		private String host = "192.168.56.102:8810";
		private String userName = "pgtest";
		private String password = "pgtest";
		private String dbName = "postgres";
		
		
		private Connection createConnect() throws SQLException
		{
			Connection conn = null;
		    
		    try {
		    	// 加载驱动
		         Class.forName("org.postgresql.Driver");
		         //创建连接。
		         conn = DriverManager
		            .getConnection("jdbc:postgresql://"+host+"/"+ this.dbName,
		            	this.userName, this.password);       
		         return conn;
		       } catch ( Exception e ) {	    	   
		         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
		         if (conn != null)
		         {
		        	 conn.close();	        	 
		         }
		         return null;
		       }
			
		}
		
		private boolean initDB() 
		{
			String tab = "select count(1) from pg_tables where tablename = 'user_info1';";
			
			String deltab = "drop table user_info1;";
			
			String addtab = "create table user_info1 (" +
					     "username text,"
					     + "phone_number int,"
					     + "address char(50),"
					     + "sex char(1),"
					     + "login_time date);";
			Connection conn;
			try
			{
				conn = createConnect();		
			    Statement stmt = conn.createStatement();
			    ResultSet rst = stmt.executeQuery(tab);
			    rst.next();
			    
			    if(rst.getInt(1) > 0)
			    {
			        stmt.executeUpdate(deltab);
			    }
			    stmt.executeUpdate(addtab);
			    
			    rst.close();
			    stmt.close();
			    conn.close();
			    
			    return true;
			    
			} catch (SQLException e) {
				
				e.printStackTrace();	
				return false;			
			}
			
		}
		
		public long inserData ()
		{
			String dataTemp = "insert into user_info1 values(";
			
			String data = null;
			long count = 0;
			
			Random r = new Random();
			try {
				
				Connection conn = createConnect();
				Statement stmt = conn.createStatement();	
				for (int i =0; i< 10; i++)
				{			
					data = dataTemp + 
					   "'user" + r.nextInt() + "'," +
						r.nextInt() + "," + 
					    "'address:the is the test grogram'," + 
						"1,'"+
					    new Date()+"');";
							
					count = stmt.executeUpdate(data);
				}	
				stmt.close();
				conn.close();
				return count;
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
			
			
			return -1;
		}
		
		public ResultSet queryData(String querySql) 
		{
			ResultSet count = null;
			try
			{
				Connection conn = createConnect();
				Statement stmt = conn.createStatement();			
				count = stmt.executeQuery(querySql);			
			}catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			return count;
		}
		
		public static void main(String[] args) {
			
			connectDB_demo cdb  = new connectDB_demo();
		    ResultSet st = null;
			cdb.initDB();
			cdb.inserData();
			try {
				st = cdb.queryData("select * from user_info1;");
				
				st.next();
				while(!st.isAfterLast())
				{
					System.out.println("user phone num:"+st.getLong(2));	
					st.next();
				}
				
				st.getStatement().getConnection().close();
				st.getStatement().close();
				st.close();
				
			} catch (SQLException e) {			
				e.printStackTrace();
				
				
			}
		      
		}
		

	}

