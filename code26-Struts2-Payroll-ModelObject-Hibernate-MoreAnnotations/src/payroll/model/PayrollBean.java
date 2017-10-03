package payroll.model;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table (name="PayrollTable")
public class PayrollBean {

	@Id //makes this variable as a primary key
	@GeneratedValue //makes incremental sequence 
	private int id;
	
	//input values
	@Column(name="pangalan", length=250, nullable=false)
	private String name;
	private int hoursWorked;
	private double payRate;
	
	@Temporal (TemporalType.TIMESTAMP)
	private Date computedPayrollDate;
	
	//@Lob
	@Transient
	private String payrollPeriodDescription;
	
	//computed values
	private double basicPay;
	private double overtimePay;
	private double grossPay;
	private double withHoldingTax;
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

	public double getWithHoldingTax() {
		return withHoldingTax;
	}

	public void setWithHoldingTax(double withHoldingTax) {
		this.withHoldingTax = withHoldingTax;
	}

	public double getNetPay() {
		return netPay;
	}

	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}
	
	//perform business logic for payroll computations
	private void computeBasicPay() {		
		setBasicPay(
			(hoursWorked > 40)
			? 40 * payRate
			: hoursWorked * payRate		
		);
	}
	
	private void computeOvertimePay() {		
		setOvertimePay(
			(hoursWorked > 40)
			? (hoursWorked - 40) * payRate * 1.5
			: 0		
		);
	}
	
	private void computeGrossPay() {
		setGrossPay(getBasicPay() + getOvertimePay());
	}
	
	//let us say that the current president lowers the tax to 10% for all
	private void computeWitHoldingTax() {
		setWithHoldingTax(getGrossPay() * 0.10);
	}
	
	private void computeNetPay() {
		setNetPay(getGrossPay() - getWithHoldingTax());
	}
	
	public void facade() {
		computeBasicPay();
		computeOvertimePay();
		computeGrossPay();
		computeWitHoldingTax();
		computeNetPay();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getComputedPayrollDate() {
		return computedPayrollDate;
	}

	public void setComputedPayrollDate(Date computedPayrollDate) {
		this.computedPayrollDate = computedPayrollDate;
	}

	public String getPayrollPeriodDescription() {
		return payrollPeriodDescription;
	}

	public void setPayrollPeriodDescription(String payrollPeriodDescription) {
		this.payrollPeriodDescription = payrollPeriodDescription;
	}	
}
