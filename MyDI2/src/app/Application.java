package app;

import dao.Withdraw;

public class Application {
	Withdraw service;

	public Withdraw getService() {
		return service;
	}

	public void setService(Withdraw service) {
		this.service = service;
	}
	
	public void print()
	{
		System.out.println(service.balance());
	}
	

}
