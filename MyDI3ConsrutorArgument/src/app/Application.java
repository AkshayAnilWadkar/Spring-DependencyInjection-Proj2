package app;

import Interface.withdraw;

public class Application {

	withdraw service;
	double amount;
	
	
	public void makepayment()
	{
		System.out.println(service.withdraw(amount));
	}
	
	public withdraw getService() {
		return service;
	}
	public void setService(withdraw service) {
		this.service = service;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
