package payroll.action;

import java.sql.Connection;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import payroll.model.PayrollBean;

public class ComputePayrollAction extends ActionSupport implements ModelDriven<PayrollBean>{
	String jdbcUrl;
	String jdbcUsername;
	String jdbcPassword;
	Connection connection = null;
	
	PayrollBean payroll = new PayrollBean();
	
	public PayrollBean getPayroll() {
		return payroll;
	}

	public void setPayroll(PayrollBean payroll) {
		this.payroll = payroll;
	}

	public String execute() {		
		payroll.facade();
		
		connection = new PayrollBean().getConnection();
		
		payroll.insertRecord(connection);
		return SUCCESS;
	}
	
	@Override
	public void validate(){
		if(payroll.getHoursWorked() <= 0){
			addFieldError("hoursWorked", "Invalid Hours.");
		}
		
		if(payroll.getPayRate() <= 0){
			addFieldError("payRate", "Invalid PayRate.");
		}
		
		if(payroll.getName().trim().length() == 0){
			addFieldError("name", "Please Input a name.");
		}
		
	}

	@Override
	public PayrollBean getModel() {
		return payroll;
	}
}
