package ua.bookUnity.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionToDB {
	
	private static final String DBURL = "jdbc:postgresql://ec2-54-221-192-231.compute-1.amazonaws.com:543/des7vh4p4n0a61";
	private static final String DBUser = "iltdwmexdojdjg";
	private static final String DBUserPassword="805aa7df283082d2e0bec6c0cc420f2e36a5d5648505178e2375e4321ce0f318";
	
	
	public static Connection getConnectionToDB() throws DAOException{
		Connection connection = null;
		try{
			connection = DriverManager.getConnection(DBURL,DBUser,DBUserPassword);
			if(connection!=null) {
				return connection;
			}else {
				throw new DAOException();
			}
		}catch(Exception e) {
			throw new DAOException();
		}
	
	}
	
}
