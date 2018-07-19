package com.del.client;

public class BankingDAOImpl implements BankingDAO {

	private double balance;
	private double minBalance=1000;
	private String user_id="Deloitte";
	private String pass="123";
	@Override
	public void depositAmount(double amount) {
		// TODO Auto-generated method stub
		balance+=amount;
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	@Override
	public void withdrawAmount(double amount1) throws BankingException {
		// TODO Auto-generated method stub
		double bal= balance-amount1;
		if(bal<minBalance)
		{
			throw new BankingException(Message.LOW_BALANCE);
		}
		else
		{
			balance=bal;
		}
	}
	@Override
	public boolean authenticate(String user_id, String pass) {
		// TODO Auto-generated method stub
		if(this.user_id.equals(user_id) && this.pass.equals(pass))
			return true;
		else return false;
	}

}
