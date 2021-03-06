package payroll.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import payroll.util.SQLCommand;

public class PayrollBean implements SQLCommand{
	// input variable
		private String name;
		private int hoursWorked;
		private double payRate;

		// computed value
		private double basicPay;
		private double overtimePay;
		private double grossPay;
		private double taxDeduction;
		private double netPay;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getHoursWorked() {
			return hoursWorked;
		}

		public void setHoursWorked(int hoursWorked) {
			this.hoursWorked = hoursWorked;
		}

		public double getPayRate() {
			return payRate;
		}

		public void setPayRate(double payRate) {
			this.payRate = payRate;
		}

		public double getBasicPay() {
			return basicPay;
		}

		public void setBasicPay(double basicPay) {
			this.basicPay = basicPay;
		}

		public double getOvertimePay() {
			return overtimePay;
		}

		public void setOvertimePay(double overtimePay) {
			this.overtimePay = overtimePay;
		}

		public double getGrossPay() {
			return grossPay;
		}

		public void setGrossPay(double grossPay) {
			this.grossPay = grossPay;
		}

		public double getTaxDeduction() {
			return taxDeduction;
		}

		public void setTaxDeduction(double taxDeduction) {
			this.taxDeduction = taxDeduction;
		}

		public double getNetPay() {
			return netPay;
		}

		public void setNetPay(double netPay) {
			this.netPay = netPay;
		}
		
		public void facade(){
			computeBasicPay();
			computeOvertimePay();
			computeGrossPay();
			computeTaxDeduction();
			computeNetPay();
		}
		
		private void computeBasicPay(){
			this.basicPay = (hoursWorked > 40)
					? 40 * payRate
					: hoursWorked * payRate;
		}
		
		private void computeOvertimePay(){
			this.overtimePay = (hoursWorked > 40)
					? (hoursWorked - 40) * payRate * 1.5 
					: 0;
		}
		
		private void computeGrossPay(){
			this.grossPay = getBasicPay() + getOvertimePay();
		}
		
		private void computeTaxDeduction(){
			this.taxDeduction = this.grossPay * 0.10;
		}
		
		private void computeNetPay(){
			this.netPay = this.grossPay - this.taxDeduction;
		}
		
		public Connection getConnection() {

			Connection connection = null;

			try {
//				Context initContext = new InitialContext();
//				Context envContext  = (Context)initContext.lookup("java:/comp/env");
//				DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
//				Connection conn = ds.getConnection();
				
				connection = ((DataSource) InitialContext.doLookup("java:/comp/env/jdbc/SE31Amazing")).getConnection();
			} catch (NamingException ne) {
				System.err.println("Class not found: " + ne.getMessage());
			} catch (SQLException sqle) {
				System.err.println("SQL Error: " + sqle.getMessage());
			}

			return connection;
		}
		
		public void insertRecord(Connection connection){ 

			if (connection != null) {
				try {
					//set auto-commit to false
					connection.setAutoCommit(false);
					
					PreparedStatement pstmnt = connection
							.prepareStatement(INSERT_REC);

					pstmnt.setString(1, this.getName());
					pstmnt.setInt(2, this.getHoursWorked());
					pstmnt.setDouble(3, this.getPayRate());
					pstmnt.setDouble(4, this.getBasicPay());
					pstmnt.setDouble(5, this.getOvertimePay());
					pstmnt.setDouble(6, this.getGrossPay());
					pstmnt.setDouble(7, this.getTaxDeduction());
					pstmnt.setDouble(8, this.getNetPay());

					// use either query or update
					pstmnt.executeUpdate();
					connection.commit();
					
				} catch (SQLException sqle) {
					if(connection != null){
						try{
							connection.rollback();
						}catch(SQLException e){
							throw new RuntimeException();
						}
					}
				}
			} else {
				throw new RuntimeException();
			}
		}
}
