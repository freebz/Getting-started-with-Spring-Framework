// 예제 1-12: FixedDepositController 클래스

package sample.spring.chapter01.bankapp;
//.....
public class FixedDepositController {
    //.....
    private FixedDepositService fixedDepositService;
    //.....
    public void setFixedDepositService(FixedDepositService fixedDepositService) {
	logger.info("Setting fixedDepositService property");
	this.fixedDepositService = fixedDepositService;
    }
    //.....
    public void submit() {
	fixedDepositService.createFixedDeposit(new FixedDepositDetails( 1, 1000, 365, "someemail@something.com"));
    }
    //.....
}
