package d0419.p910OracleDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			//JDBC등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기
			conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XE",
					"C##GREEN",
					"GREEN1234");
			System.out.println("연결 성공");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					//연결끊기
					conn.close();
					System.out.println("연결 끊기");
				}catch(SQLException e) {}
			}
		}		
	}
}
