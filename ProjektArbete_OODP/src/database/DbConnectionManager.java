package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


	
	public class DbConnectionManager {
		
		private static final String DB_NAME = "OODPtestDb"; // Change value to your database
		private static final String USER = "postgres"; // Change value to your user
		private static final String PASSWORD = "Chrille0" ; // Change value to your password
		private static final String CONNECTION_URL = "jdbc:postgresql://localhost/" + DB_NAME;
		
		private Connection connection = null;
		private Statement statement = null;
		private ResultSet resultSet = null;
		
		private static DbConnectionManager instance = null;
		
		private DbConnectionManager(){}
		
		public static DbConnectionManager getInstance() {
			if(instance == null) {
				instance = new DbConnectionManager();
			}
			return instance;
		}
	
	
	private Connection getConnection() {
        try {
            connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return connection;
	}
	private Statement getStatement(Connection connection) {
		try{
			statement =  connection.createStatement();
		}
		catch (SQLException e) {
			System.err.println("Could not create Statement");
			System.err.println(e.getMessage());
		}
		return statement;
	}
	
	
	public ResultSet excecuteQuery( String sqlString) throws SQLException {
		return this.getStatement(this.getConnection()).executeQuery(sqlString);
	}
	public PreparedStatement prepareStatement(String statementString) throws SQLException {
		return this.getConnection().prepareStatement(statementString);
	}
	
	public void close() {
		try{
			if(statement != null) statement.close();
			if(connection != null) connection.close();
			System.out.println("DB Connection closed");
		}catch (SQLException e) {
			System.err.println("Could not close the statement or the connection");
			System.err.println(e.getMessage());
		}
	}
	
	
	}
	
