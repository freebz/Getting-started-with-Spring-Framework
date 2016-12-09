// 예제 11-29: FixedDepositController - JSR 303 전용 API로 FixedDepositDetails 유효성 검사

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;
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

	Set<ConstraintViolation<FixedDepositDetails>> violations =
	    validator.validate(fixedDepositDetails);
	Iterator<ConstraintViolation<FixedDepositDetails>> itr = violations.iterator();
	
	if (itr.hasNext()) { ..... } .....
    }
    .....
}
