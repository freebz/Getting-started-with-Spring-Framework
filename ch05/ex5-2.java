// 예제 5-2: FixedDepositServiceImpl 클래스

package sample.spring.chapter05.bankapp.service;

public class FixedDepositServiceImpl implements FixedDepositService {
    private static Logger logger = Logger.getLogger(FixedDepositServiceImpl.class);
    private FixedDepositDao myFixedDepositDao;

    public void setMyFixedDepositDao(FixedDepositDao myFixedDepositDao) {
	logger.info("FixedDepositServiceImpl's setMyFixedDepositDao method invoked");
	this.myFixedDepositDao = myFixedDepositDao;
    }

    @Override
    public void createFixedDeposit(FixedDepositDetails fixedDepositDetails) throws Exception {
	// -- 정기 예금을 생성한다.
	myFixedDepositDao.createFixedDeposit(fixedDepositDetails);
    }
}
