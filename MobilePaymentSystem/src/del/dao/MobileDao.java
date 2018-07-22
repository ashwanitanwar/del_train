package del.dao;

public interface MobileDao {

	boolean authenticate(String login, String password);

	String getMobile();

	double getDue();

	void billPayment(double amount);

}
