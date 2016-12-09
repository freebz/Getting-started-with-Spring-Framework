// 예제 11-21: FixedDepositController - BindingResult를 사용한 바인딩 및 유효성 오류 확인

package sample.spring.chapter11.web;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
.....
public class FixedDepositController {
    .....
    @RequestMapping(params = "fdAction=create", method = RequestMethod.POST)
    public String openFixedDeposit(
        @ModelAttribute(value = "newFixedDepositDetails") FixedDepositDetails fixedDepositDetails,
	    BindingResult bindingResult, SessionStatus sessionStatus) {
	.....
	if (bindingResult.hasErrors()) {
	    return "createFixedDepositForm";
	} else {
	    fixedDepositService.saveFixedDeposit(fixedDepositDetails);
	    sessionStatus.setComplete();
	    return "redirect:/fixedDeposit/lsit";
	}
    }
    .....
}
