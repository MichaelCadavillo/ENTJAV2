package process.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.EmployeeBean;

public class ComputeTakeHomePayAction extends ActionSupport implements ModelDriven<EmployeeBean> {
	
	EmployeeBean emp = new EmployeeBean();
	
	public String execute(){
		emp.compute();
		
		//hibernate operations
				SessionFactory sessionFactory = 
						new Configuration().configure().buildSessionFactory();
					
					Session session = null;
					org.hibernate.Transaction transaction = null;
					
					try{
						session = sessionFactory.openSession();
						
						if(session != null){
							transaction = session.beginTransaction();
							session.save(emp);
							transaction.commit();
						}else{
							System.out.println("Session is null");
						}
					}catch(Exception e){
						transaction.rollback();
					}
		
		return SUCCESS;
	}
	
	@Override
	public void validate(){
		if(emp.getName().trim().isEmpty()){
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
