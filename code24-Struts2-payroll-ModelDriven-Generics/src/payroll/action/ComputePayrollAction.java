package payroll.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import payroll.model.PayrollBean;

public class ComputePayrollAction extends ActionSupport implements ModelDriven<PayrollBean>{
	
	PayrollBean payroll = new PayrollBean();
	
	public PayrollBean getPayroll() {
		return payroll;
	}

	public void setPayroll(PayrollBean payroll) {
		this.payroll = payroll;
	}

	public String execute() {
		payroll.facade();
		
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
