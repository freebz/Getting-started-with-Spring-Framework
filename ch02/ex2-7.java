// 예제 2-7: FixedDepositDaoFactory 클래스

public class FixedDepositDaoFactory {
    public FixedDepositDaoFactory() {
    }

    public FixedDepositDao getFixedDepositDao(String daoType) {
	FixedDepositDao fixedDepositDao = null;

	if("jdbc".equalsIgnoreCase(daoType)) {
	    fixedDepositDao = new FixedDepositJdbcDao();
	}
	if("hibernate".equalsIgnoreCase(daoType)) {
	    fixedDepositDao = new FixedDepositHibernateDao();
	}
	//.....
	return fixedDepositDao;
    }
}
