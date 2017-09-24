package payroll.util;

public interface SQLCommand {

	String INSERT_REC = "INSERT into payroll (employeeName, hoursWorked, payRate, basicPay, overtimePay, grossPay, withholdingTax, netPay) VALUES (?,?,?,?,?,?,?,?)";
	
}
