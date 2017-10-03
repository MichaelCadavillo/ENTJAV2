package payroll.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import payroll.model.PayrollBean;

public class ComputePayrollAction extends ActionSupport 
	implements ModelDriven<PayrollBean> {

	private PayrollBean payroll = new PayrollBean();
	
	public String execute() {
				
		payroll.facade();
		
		payroll.setComputedPayrollDate(new java.util.Date());
		
		payroll.setPayrollPeriodDescription("This is for "
			+ "the October 15, 2017 payroll period. I am sure "
			+ "that employees will be happy as they will be doing shopping spree. "
			+ "But please save first or better yet invest first before spending. "
			+ "Determine needs against wants. This will make you financially free.");
		
		System.out.println("Name: " + payroll.getName());
		System.out.println("Hours Worked: " + payroll.getHoursWorked());
		System.out.println("Payrate: Php" + payroll.getPayRate());
		System.out.println("Basic Pay: Php" + payroll.getBasicPay());
		System.out.println("Overtime Pay: Php" + payroll.getOvertimePay());
		System.out.println("Gross Pay: Php" + payroll.getGrossPay());
		System.out.println("Withholding Tax: Php" + payroll.getWithHoldingTax());
		System.out.println("NETPAY: Php" + payroll.getNetPay());
		
		//for hibernate operations
		SessionFactory sessionFactory = 
			new Configuration().configure().buildSessionFactory();
			
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			
			if (session != null) {
				transaction = session.beginTransaction();
				session.save(payroll); //insert into sql statement equivalent
				transaction.commit();
			} else {
				System.err.println("session is null.");
			}			
		} catch (Exception e) {
			transaction.rollback();
		}		
		return SUCCESS;
	}
		
	@Override
	public void validate() {
		if (payroll.getName().trim().length() == 0) {
			addFieldError("name", "Missing name.");
		}
		
		if (payroll.getHoursWorked() <= 0) {
			addFieldError("hoursWorked", "Invalid hours worked.");
		}
		
		if (payroll.getPayRate() <= 0) {
			addFieldError("payRate", "Invalid rate per hour.");
		}
		
    }

	public PayrollBean getPayroll() {
		return payroll;
	}

	public void setPayroll(PayrollBean payroll) {
		this.payroll = payroll;
	}

	@Override
	public PayrollBean getModel() {
		return payroll;
	}
}
