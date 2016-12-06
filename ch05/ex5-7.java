// 예제 5-7: FixedDepositDaoImpl 클래스 - @PostConstruct 및 @PreDestroy 어노테이션

package sample.spring.chapter05.bankapp.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class FixedDepositDaoImpl implements FixedDepositDao {
    private DatabaseConnection connection;
    .....
    @PostConstruct
    public void initializeDbConnection() {
	logger.info("FixedDepositDaoImpl's initializeDbConnection method invoked");
	connection = DatabaseConnection.getInstance();
    }
    .....
    @PreDestroy
    public void releaseDbConnection() {
	logger.info("FixedDepositDaoImpl's releaseDbConnection method invoked");
	connection.releaseConnection();
    }
}
