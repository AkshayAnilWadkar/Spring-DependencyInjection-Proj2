package bank;

import Interface.withdraw;

public class SBI implements withdraw
{
	double balance;
	
	public SBI(double b) {
	super();
	this.balance=b;
	}

	@Override
	public String withdraw(double amount) {
		// TODO Auto-generated method stub
		balance-=amount;
		return  "Sbi balance is"+balance;
	}

}
