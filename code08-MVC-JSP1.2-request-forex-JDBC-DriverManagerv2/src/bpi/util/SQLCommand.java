package bpi.util;

public interface SQLCommand {
	
	String INSERT_REC = "INSERT into forex (pesoAmount, currencyType, result, message) VALUES (?,?,?,?)";

}
