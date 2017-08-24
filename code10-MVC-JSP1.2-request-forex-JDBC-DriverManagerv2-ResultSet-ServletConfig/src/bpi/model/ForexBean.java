package bpi.model;

import bpi.util.SQLCommand;

import java.sql.*;

public class ForexBean implements SQLCommand {

	// input values
	private int pesoAmount;
	private String currencyType;

	// computed Values
	private double result;
	private String message;

	// create setter and getter methods
	public int getPesoAmount() {
		return pesoAmount;
	}

	public void setPesoAmount(int pesoAmount) {
		this.pesoAmount = pesoAmount;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// business logic
	public void compute() {
		switch (this.currencyType) {
		case "USD":
			this.result = this.pesoAmount / 51.11;
			this.message = "US$" + result;
			break;
		case "EUR":
			this.result = this.pesoAmount / 59.88;
			this.message = "EUR" + result;
			break;
		case "YEN":
			this.result = this.pesoAmount / 0.4676;
			this.message = "YEN" + result;
			break;
		case "AUS":
			this.result = this.pesoAmount / 40.60;
			this.message = "AUS" + result;
			break;

		}
	}

	// SQL Operations
	public Connection getConnection(String jdbcUrl, String jdbcUsername, String jdbcPassword) {

		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
		} catch (ClassNotFoundException cnfe) {
			System.err.println("Class not found: " + cnfe.getMessage());
		} catch (SQLException sqle) {
			System.err.println("SQL Error: " + sqle.getMessage());
		}

		return connection;
	}

	public void insertRecord(Connection connection){ 

		if (connection != null) {
			try {
				PreparedStatement pstmnt = connection
						.prepareStatement(INSERT_REC);

				pstmnt.setInt(1, this.getPesoAmount());
				pstmnt.setString(2, this.getCurrencyType());
				pstmnt.setDouble(3, this.getResult());
				pstmnt.setString(4, this.getMessage());

				// use either query or update
				pstmnt.executeUpdate();
				
			} catch (SQLException sqle) {
				throw new RuntimeException();
			}
		} else {
			throw new RuntimeException();
		}
	}
	
	public ResultSet getAllRecords(Connection connection){
		ResultSet records = null;
		
		if (connection != null) {
			try {
				PreparedStatement pstmnt = connection
						.prepareStatement(GET_ALL_RECORDS);
				
				records = pstmnt.executeQuery(); //executeQuery for SELECT; executeUpdate for others
				
			}catch (SQLException sqle){
				throw new RuntimeException();
			}
		}else{
			throw new RuntimeException();
		}
		
		return records;
	}
}
