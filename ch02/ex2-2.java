// 예제 2-2: FixedDepositService 클래스

package sample.spring.chapter02.bankapp;

public class FixedDepositServiceImpl implements FixedDepositService {
    private FixedDepositDao fixedDepositDao;
    //.....
    public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
	this.fixedDepositDao = fixedDepositDao;
    }

    public FixedDepositDetails getFixedDepositDetails(long id) {
	return fixedDepositDao.getFixedDepositDetails(id);
    }

    public boolean createFixedDeposit(FixedDepositDetails fdd) {
	return fixedDepositDao.createFixedDeposit(fdd);
    }
}
