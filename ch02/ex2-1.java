// 예제 2-1: FixedDepositService 클래스

public class FixedDepositService {
    private FixedDepositHibernateDao fixedDepositDao;

    public void setFixedDepositDao(FixedDepositHibernateDao fixedDepositDao) {
	this.fixedDepositDao = fixedDepositDao;
    }

    public FixedDepositDetails getFixedDepositDetails(long id) {
	return fixedDepositDao.getFixedDepositDetails(id);
    }

    public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
	return fixedDepositDao.createFixedDeposit(fixedDepositDetails);
    }
}
