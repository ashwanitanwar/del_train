package del.service;

import del.dao.MobileDao;
import del.dao.MobileDaoImpl;

public class MobileServiceImpl implements MobileService {
	private MobileDao mDao;
	public MobileServiceImpl() {
        mDao = new MobileDaoImpl();
    }
	@Override
	public boolean authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return mDao.authenticate(login,password);
	}
	@Override
	public String getMobile() {
		// TODO Auto-generated method stub
		return mDao.getMobile();
	}
	@Override
	public double getDue() {
		// TODO Auto-generated method stub
		return mDao.getDue();
	}
	@Override
	public void billPayment(double amount) {
		// TODO Auto-generated method stub
		mDao.billPayment(amount);
	}
}
