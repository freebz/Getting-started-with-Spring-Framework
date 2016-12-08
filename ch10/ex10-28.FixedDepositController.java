// 예제 10-28: FixedDepositController 클래스 - 모든 요청 매개변수 접근

package sample.spring.chapter10.web;

import java.util.Map;
.....
@RequestMapping(value = "/fixedDeposit")
public class FixedDepositController {
    .....
    @RequestMapping(params = "fdAction=create", method = RequestMethod.POST)
    public ModelAndView openFixedDeposit(@RequestParam Map<String, String> params) {
	String depositAmount = params.get("depositAmount");
	String tenure = params.get("tenure");
	.....
    }
}
