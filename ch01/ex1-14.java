// 예제 1-14: FixedDepositController 클래스

package sample.spring.chapter01.bankapp;

import org.apache.log4j.Logger;

public class FixedDepositController {
    private static Logger logger = Logger.getLogger(FixedDepositController.class);
    
    private FixedDepositService fixedDepositService;

    public FixedDepositController() {
	logger.info("initializing");
    }
    
    public void setFixedDepositService(FixedDepositService fixedDepositService) {
	logger.info("Setting fixedDepositService property");
	this.fixedDepositService = fixedDepositService;
    }
    .....
}
