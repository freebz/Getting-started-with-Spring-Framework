// 예제 10-27: FixedDepositController 클래스 - @RequestParam 사용

package sample.spring.chapter10.web;

import org.springframework.web.bind.annotation.RequestParam;
.....
public class FixedDepositController {
    .....
    @RequestMapping(params = "fdAction=close", method = RequestMethod.GET)
    public String closeFixedDeposit(@RequestParam(value = "fixedDepositId") int fdId) {
	fixedDepositService.closeFixedDeposit(fdId);
	return "redirect:/fixedDeposit/list";
    }
    .....
}
