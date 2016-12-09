// 예제 11-12: SessionStatus 객체를 사용해 HttpSession에서 모델 특성을 제거

package sample.spring.chapter11.web;

import org.springframework.web.bind.support.SessionStatus;
.....
@SessionAttributes(value = { "newFixedDepositDetails", "editableFixedDepositDetails" })
public class FixedDepositController {
    .....
    @RequestMapping(params = "fdAction=create", method = RequestMethod.POST)
    public String openFixedDeposit(
            @ModelAttribute(value = "newFixedDepositDetails") FixedDepositDetails fixedDepositDetails,
	    ....., SessionStatus sessionStatus) {
	    fixedDepositService.saveFixedDeposit(fixedDepositDetails);
	    sessionStatus.setComplete();
        }
    }

    @RequestMappint(params = "fdAction=edit", method = RequestMethod.POST)
    public String editFixedDepositDetails(
            @ModelAttribute("editableFixedDepositDetails") FixedDepositDetails fixedDepositDetails,
	    ....., SessionStatus sessionStatus) {
	    fixedDepositService.editFixedDeposit(fixedDepositDetails);
	    sessionStatus.setComplete();
	    ....
        }
    }
    ....
}
