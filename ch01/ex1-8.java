// 예제 1-8: active 변수를 사용하는 FixedDepositService

public class FixedDepositService {
    private boolean active;

    public FixedDepositDetails getFixedDepositDetails( ..... ){
	if (active) { ..... }
    }
    public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
	if (active) { ..... }
    }
    public void activateService() {
	active = true;
    }
    public void deactivateService() {
	active = false;
    }
}
