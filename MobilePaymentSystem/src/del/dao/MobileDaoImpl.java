package del.dao;

public class MobileDaoImpl implements MobileDao {

	private String login="9999999999";
    private String password="del123";
    private double dueAmount=2500;
    @Override
    public boolean authenticate(String login, String password) {
        return this.login.equals(login) && 
                this.password.equals(password);
    }
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getDueAmount() {
		return dueAmount;
	}
	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}
	@Override
	public String getMobile() {
		// TODO Auto-generated method stub
		return getLogin();
	}
	@Override
	public double getDue() {
		// TODO Auto-generated method stub
		return getDueAmount();
	}
	@Override
	public void billPayment(double amount) {
		// TODO Auto-generated method stub
		dueAmount=dueAmount-amount;
	}
    
}
