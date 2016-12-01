// 예제 2-4: FixedDepositDaoFactory 클래스

public class FixedDepositDaoFactory {
    private FixedDepositDaoFactory() { }

    public static FixedDepositDao getFixedDepositDao(String daoType) {
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
