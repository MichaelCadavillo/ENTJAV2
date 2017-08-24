package model;

public class EmployeeBean{

	private String name;
	private String code;
	private double sales;
	private double gross;
	private double commission;
	private double takeHomePay;

	public double getTakeHomePay() {
		return takeHomePay;
	}

	public void setTakeHomePay(double takeHomePay) {
		this.takeHomePay = takeHomePay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public double getGross() {
		return gross;
	}

	public void setGross(double gross) {
		this.gross = gross;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public void compute() {
		if(this.code.equals("A")){
			this.gross = 175 + (this.sales*0.50);
		}else if(this.code.equals("B")){
			this.gross = 100 + (this.sales*0.20);
		}else if(this.code.equals("C")){
			this.gross = 50 + (this.sales*0.25);
		}
		
		if(sales > 2500){
			this.commission = sales * 0.075;
		}else{
			this.commission = 0;
		}
		
		this.takeHomePay = this.gross + this.commission;
	}

}
