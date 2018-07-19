package com.del.client;

public class BankingServiceImpl implements BankingService {

	private BankingDAO bDAO;
	
	public BankingServiceImpl() {
		bDAO = new BankingDAOImpl();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositAmount(double amount) throws BankingException {
		// TODO Auto-generated method stub
		if(amount<0)
		{
			throw new BankingException(Message.NEGATIVE_VALUES);
		}
		bDAO.depositAmount(amount);
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return bDAO.getBalance();
	}

	@Override
	public void withdrawAmount(double amount1) throws BankingException {
		// TODO Auto-generated method stub
		bDAO.withdrawAmount(amount1);
	}

	@Override
	public boolean authenticate(String user_id, String pass) {
		// TODO Auto-generated method stub
		return bDAO.authenticate(user_id,pass);
	}
}
