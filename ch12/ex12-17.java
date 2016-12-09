// 예제 12-17: FixedDepositController의 openFixedDeposit 및 handleException 메서드

package sample.spring.chapter12.web;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import sample.spring.chapter12.exception.ValidationException;
.....
@Controller
@RequestMapping(value = "/fixedDeposits")
public class FixedDepositController {
    .....
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<FixedDepositDetails> openFixedDeposit(
            @RequestBody FixedDepositDetails fixedDepositDetails, BindingResult bindingResult) {

	new FixedDepositValidator().validate(fixedDepositDetails, bindingResult);

	if (bindingResult.hasErrors()) {
	    throw new ValidationException("Validation errors sccurred");
	} else {
	    fixedDepositService.saveFixedDeposit(fixedDepositDetails);
	    .....
	}

	
	@ExceptionHandler(ValidationException.class)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public String handleException(Exception ex) {
	    return ex.getMessage();
	}
    }
    .....
}
