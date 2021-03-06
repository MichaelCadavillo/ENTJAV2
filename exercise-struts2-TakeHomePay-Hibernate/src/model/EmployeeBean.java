package model;

import javax.persistence.*;

@Entity (name="TakeHomePay")
public class EmployeeBean{

	@Id //makes this variable as a primary key || try @id
	@GeneratedValue //makes incremental sequence
	private int id;
	
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
		if(this.code.equals("1")){
			this.gross = 175 + (this.sales*0.50);
			this.code = "A";
		}else if(this.code.equals("2")){
			this.gross = 100 + (this.sales*0.20);
			this.code = "B";
		}else if(this.code.equals("3")){
			this.gross = 50 + (this.sales*0.25);
			this.code = "C";
		}
		
		if(sales > 2500){
			this.commission = sales * 0.075;
		}else{
			this.commission = 0;
		}
		
		this.takeHomePay = this.gross + this.commission;
	}

}
