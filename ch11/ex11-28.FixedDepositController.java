// 예제 11-28: FixedDepositController - 스프링 유효성 검사 API로 FixedDepositDetails의 유효성 검사

package sample.spring.chapter11.web;

import javax.validation.Valid;
.....
public class FixedDepositController {
    .....

    @Autowired
    private Validator validator;
    .....
    @RequestMapping(params = "fdAction=create", method = RequestMethod.POST)
    public String openFixedDeposit(
        @ModelAttribute(value = "newFixedDepositDetails") FixedDepositDetails fixedDepositDetials,
	BindingResult bindingResult, SessionStatus sessionStatus) {
	validator.validate(fixedDepositDetails, bindingResult);
	
	if (bindingResult.hasErrors()) { ..... } .....
    }
    .....
}
