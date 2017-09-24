package process.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.EmployeeBean;

public class ComputeTakeHomePayAction extends ActionSupport implements ModelDriven<EmployeeBean> {
	
	EmployeeBean emp = new EmployeeBean();
	
	public String execute(){
		emp.compute();
		
		return SUCCESS;
	}
	
	@Override
	public void validate(){
		if(emp.getName().isEmpty()){
			addFieldError("name", "Please input a name!");
		}
		
		if(emp.getCode().length() == 0){
			addFieldError("code", "Please choose a sales code!");
		}
		
		if(!emp.getCode().equals("1") && !emp.getCode().equals("2") && !emp.getCode().equals("3")){
			addFieldError("code", "Invalid sales code!");
		}
		
		if(emp.getSales() <= 0){
			addFieldError("sales", "Invalid sales amount!");
		}
	}
	
	public EmployeeBean getEmp() {
		return emp;
	}

	public void setEmp(EmployeeBean emp) {
		this.emp = emp;
	}

	@Override
	public EmployeeBean getModel() {
		return emp;
	}
	
}
