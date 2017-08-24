package bpi.util;

public interface SQLCommand {
	
	String INSERT_REC = "INSERT into forex (pesoAmount, currencyType, result, message) VALUES (?,?,?,?)";
	
	String GET_ALL_RECORDS = "SELECT * FROM forex";

}
