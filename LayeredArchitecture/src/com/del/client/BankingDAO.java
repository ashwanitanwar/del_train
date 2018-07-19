package com.del.client;

public interface BankingDAO {

	void depositAmount(double amount);

	double getBalance();

	void withdrawAmount(double amount1) throws BankingException;

	boolean authenticate(String user_id, String pass);

}
