// 예제 12-9: @RequestBody 어노테이션 사용

package sample.spring.chapter12.web;
.....
import org.springframework.web.bind.annotation.RequestBody;
.....
@Controller
@RequestMapping(value = "/fixedDeposits")
public class FixedDepositController {
    .....
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<FixedDepositDetails> openFixedDeposit(
            @RequestBody FixedDepositDetails fixedDepositDetails,
	    BindingResult bindingResult) {
	new FixedDepositDetailsValidator().validate(fixedDepositDetails, bindingResult);
	.....
    }
    .....
}
