package del.service;

public interface MobileService {

	boolean authenticate(String login, String password);

	String getMobile();

	double getDue();

	void billPayment(double amount);

}
