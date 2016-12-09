// 예제 11-30: FixedDepositController - @Valid 어노테이션을 사용한 유효성 검사

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
        @Valid @ModelAttribute(value = "newFixedDepositDetails") FixedDepositDetails fixedDepositDetials,
	BindingResult bindingResult, SessionStatus sessionStatus) {

	if (bindingResult.hasErrors()) { ..... } .....
    }
    .....
}
