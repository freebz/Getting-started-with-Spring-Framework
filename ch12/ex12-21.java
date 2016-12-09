// 예제 12-21: FixedDepositController - @PathVariable 사용

package sample.spring.chapter12.web;

import org.springframework.web.bind.annotation.PathVariable;
.....
@Controller
public class FixedDepositController {
    .....
    @RequestMapping(value="/fixedDeposits/{fixedDepositId}", method = RequestMethod.GET)
    public ResponseEntity<FixedDepositDetails> getFixedDeposit(
            @PathVariable("fixedDepositId") int id) {
	return new ResponseEntity<FixedDepositDetails>(
            fixedDepositService.getFixedDeposit(id), HttpStatus.OK);
    }
    .....
}
