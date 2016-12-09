// 예제 11-9: 메서드 인자에 @ModelAttribute 어노테이션 사용

package sample.spring.chapter11.web;
.....
@Controller
@RequestMapping(value = "/fixedDeposit")
.....
public class FixedDepositController {
    .....
    @ModelAttribute(value = "newFixedDepositDetails")
    public FixedDepositDetails getNewFixedDepositDetails() {
	.....
	logger.info("getNewFixedDepositDetails() method:Returning a new instance of FixedDepositDetails");
	.....
    }

    @RequestMapping(params = "fdAction=create", method = RequestMethod.POST)
    public String openFixedDeposit(
        @ModelAttribute(value = "newFixedDepositDetails")
	FixedDepositDetails fixedDepositDetails,.....) {
	    .....
	    fixedDepositService.saveFixedDeposit(fixedDepositDetails);
	    logger.info("openFixedDeposit() method: Fixed deposit details successfully saved. Redirecting to show the list of fixed deposits.");
	    .....
	}
    }
    .....
}
