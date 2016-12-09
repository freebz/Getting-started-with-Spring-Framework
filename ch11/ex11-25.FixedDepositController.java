// 예제 11-25: FixedDepositController - FixedDepositDetailsValidator의 validate 메서드를 명시적으로 호출해 유효성을 검사

package sample.spring.chapter11.web;
.....
public class FixedDepositController {
    .....
    @RequestMapping(params = "fdAction=create", method = RequestMethod.POST)
    public String openFixedDeposit(
        @ModelAttribute(value = "newFixedDepositDetails") FixedDepositDetails fixedDepositDetials,
	BindingResult bindingResult, SessionStatus sessionStatus) {

	new FixedDepositDetailsValidator().validate(fixedDepositDetials,bindingResult);
	if (bindingResult.hasErrors()) {
	    logger.info("openFixedDeposit() method: Validation errors - re-displaying form for opening a new fixed deposit");
	    return "createFixedDepositForm";
	}
	.....
    }
}
