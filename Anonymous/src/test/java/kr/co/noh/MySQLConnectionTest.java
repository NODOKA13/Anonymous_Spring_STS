//package kr.co.noh;
//
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//import org.junit.Test;
//
////73
//public class MySQLConnectionTest {
//	
//	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
//	private static final String URL = "jdbc:mysql://localhost:3306/anonymous?useSSL=false";
//	private static final String USER = "root";
//	private static final String PW = "12345";
//	
//	@Test
//	public void testConnection() throws Exception {
//		Class.forName(DRIVER);
//		
//		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
//			System.out.println(con);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
