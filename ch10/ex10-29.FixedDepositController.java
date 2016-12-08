// 예제 10-29: FixedDepositController 클래스 - 모든 요청 매개변수 접근

package sample.spring.chapter10.web;

import org.springframework.util.MultiValueMap;
.....
@RequestMapping(value = "/fixedDeposit")
public class FixedDepositController {
    .....
    @RequestMapping(params = "fdAction=edit", method = RequestMethod.POST)
    public ModelAndView editFixedDeposit(@RequestParam MultiValueMap<String, String> params) {
	String depositAmount = params.get("depositAmount").get(0);
	String tenure = params.get("tenure").get(0);
	.....
    }
}
