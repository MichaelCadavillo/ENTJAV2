package payroll.action;

public class ComputePayrollAction {
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

	public String execute() {
		setName("Dirk Nowitzki");
		setHoursWorked(50);
		setPayRate(750);
		String status = "error";
		
		if(getHoursWorked() > 0 || getPayRate() > 0 || getName().trim().length() > 0){
			facade();
			
			System.out.println("Name: " + getName());
			System.out.println("Hours Worked: " + getHoursWorked());
			System.out.println("Payrate: Php" + getPayRate());
			System.out.println("Basic Pay: Php" + getBasicPay());
			System.out.println("Overtime Pay: Php" + getOvertimePay());
			System.out.println("Gross Pay: Php" + getGrossPay());
			System.out.println("Withholding Tax: Php" + getTaxDeduction());
			System.out.println("Net Pay: Php" + getNetPay());
			status = "success";
		}
		
		return status;
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
}