// 예제 5-10: FixedDepositDaoImpl 클래스

package sample.spring.chapter05.bankapp.dao;

import org.apache.log4j.Logger;
import sample.spring.chapter05.bankapp.common.InstanceValidator;

public class FixedDepositDaoImpl implements FixedDepositDao, InstanceValidator {
    private static Logger logger = Logger.getLogger(FixedDepositDaoImpl.class);
    private DatabaseConnection connection;

    public FixedDepositDaoImpl() {
	logger.info("FixedDepositDaoImpl's constructor invoked");
    }
    
    public void initializeDbConnection() {
	logger.info("FixedDepositDaoImpl's initializeDbConnection method invoked");
	connection = DatabaseConnection.getInstance();
    }

    @Override
    public void validateInstance() {
	logger.info("Validating FixedDepositDaoImpl instance");
	if(connection == null) {
	    logger.error("Failed to obtain DatabaseConnection instance");
	}
    }
}
