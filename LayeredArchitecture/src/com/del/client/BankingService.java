package com.del.client;

public interface BankingService {

	void depositAmount(double amount) throws BankingException;

	double getBalance();

	void withdrawAmount(double amount1) throws BankingException;

	boolean authenticate(String user_id, String pass);

}
