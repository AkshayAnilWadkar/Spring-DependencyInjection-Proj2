package bank;

import Interface.withdraw;

public class Axis implements withdraw {

	double balance;
	public Axis(double b) {
		// TODO Auto-generated constructor stub
		super();
	this.balance=b;
	}
	
	@Override
	public String withdraw(double amount) {
		// TODO Auto-generated method stub
		balance -=amount;
		return "Axis balance is"+balance;
	}

}
