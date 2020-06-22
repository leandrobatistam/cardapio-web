package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {

	public static Connection getConectar() {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("sql10.freemysqlhosting.net/sql10349686", "sql10349686", "ucyF26UhPX")
		return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	
	}

}
