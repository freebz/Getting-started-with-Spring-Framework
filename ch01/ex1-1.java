// 예제 1-1: FixedDepositController 클래스

public class FixedDepositController {
    private FixedDepositService fixedDepositService;

    public FixedDepositController() {
	fixedDepositService = new FixedDepositService();
    }

    public boolean submit() {
	//-- 정기 예금 내역 저장
	fixedDepositService.save(.....);
    }
}
