// 예제 1-2: FixedDepositController 클래스 - FixedDepositService가 생성자 인자로 전달된다.

public class FixedDepositController {
    private FixedDepositService fixedDepositService;

    public FixedDepositController(FixedDepositService fixedDepositService) {
	this.fixedDepositService = fixedDepositService;
    }

    public boolean submit() {
	//-- 정기 예금 내역 저장
	fixedDepositService.save(.....);
    }
}
