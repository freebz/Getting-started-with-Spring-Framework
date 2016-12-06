// 예제 5-1: FixedDepositDaoImpl 클래스 - 사용자 지정 초기화 및 삭제 논리

package sample.spring.chapter05.bankapp.dao;

public class FixedDepositDaoImpl implements FixedDepositDao {
    private static Logger logger = Logger.getLogger(FixedDepositDaoImpl.class);
    private DatabaseConnection connection;

    public FixedDepositDaoImpl() {
	logger.info("FixedDepositDaoImpl's constructor invoked");
    }

    public void initializeDbConnection() {
	logger.info("FixedDepositDaoImpl's initializeDbConnection method invoked");
	connection = DatabaseConnection.getInstance();
    }

    public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
	logger.info("FixedDepositDaoImpl's createFixedDeposit method invoked");
	// -- 정기 예금을 저장하고 true를 반환한다.
	return true;
    }

    public void releaseDbConnection() {
	logger.info("FixedDepositDaoImpl's releaseDbConnection method invoked");
	connection.releaseConnection();
    }
}
