// 예제 11-26: FixedDepositController - @Valid 어노테이션을 사용한 유효성 검사

import javax.validation.Valid;
.....
public class FixedDepositController {
    .....
    @RequestMapping(params = "fdAction=create", method = RequestMethod.POST)
    public String openFixedDeposit(
        @Valid @ModelAttribute(value = "newFixedDepositDetails") FixedDepositDetails fixedDepositDetials,
	BindingResult bindingResult, SessionStatus sessionStatus) {

	if (bindingResult.hasErrors()) {
	    logger.info("openFixedDeposit() method: Validation errors - re-displaying form for opening a new fixed deposit");
	    return "createFixedDepositForm";
	}
	.....
    }
    .....
    @InitBinder(value = "newFixedDepositDetails")
    public void initBinder_New(WebDataBinder webDataBinder) {
	webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(
            new SimpleDateFormat("MM-dd-yyyy"), false));
	webDataBinder.setValidator(new FixedDepositDetailsValidator());
    }
    .....
}
