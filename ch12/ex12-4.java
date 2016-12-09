// 예제 12-4: FixedDepositController - ResponseEntity 인스턴스 생성

package sample.spring.chapter12.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
.....
@Controller
@RequestMapping(value = "/fixedDeposits")
public class FixedDepositController {
    .....
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<FixedDepositDetails>> getFixedDepositList() {
	.....
	return new ResponseEntity<List<FixedDepositDetails>>(
            fixedDepositService.getFixedDeposit(), HttpStatus.OK);
    }
    .....
}
