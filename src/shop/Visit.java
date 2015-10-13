package shop;

import java.sql.Date;

public class Visit extends Customer{
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	public Visit(String name,java.util.Date date2){
		super(name);
		this.date =(Date) date2;
		
	}
	public String getName(){
		return this.getName();
	}
	public double getServiceExpense(){
		return serviceExpense;
	}
	public void setserviceExpense(double ex){
		this.serviceExpense =ex;
	}
	public double getProductExpense(){
		return productExpense;
	}
	public void setProductExpense(double ex){
		this.productExpense =ex;
	}
	public double getTotalExpense(){
		DiscountRate d1 = new DiscountRate();
		return this.productExpense*d1.getProductDiscountRate(this.getMemberType())+this.serviceExpense*d1.getServiceDiscountRate(this.getMemberType());
	}
}