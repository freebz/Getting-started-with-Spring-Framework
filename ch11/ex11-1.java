// 예제 11-1: 메서드 단계의 @ModelAttribute 어노테이션 사용

package sample.spring.chapter11.web;

import org.springframework.web.bind.annotation.ModelAttribute;
import sample.spring.chapter11.domain.FixedDepositDetails;
.....
@Controller
@RequestMapping(value = "/fixedDeposit")
.....
public class FixedDepositController {
    private static Logger logger = Logger.getLogger(FixedDepositController.class);
    .....
    @ModelAttribute(value = "newFixedDepositDetails")
    public FixedDepositDetails getNewFixedDepositDetails() {
	FixedDepositDetails fixedDepositDetails = new FixedDepositDetails();
	fixedDepositDetails.setEmail("You must enter a valid email");
	logger.info("getNewFixedDepositDetails() method:Returning a new instance of FixedDepositDetails");
	return fixedDepositDetails;
    }
    .....
}
