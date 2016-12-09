// 예제 12-5: FixedDepositController - ResponseEntity 대신 HttpEntity 사용

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpEntity;
.....
@Controller
@RequestMapping(value = "/fixedDeposits")
public class FixedDepositController {
    .....
    @RequestMapping(method = RequestMethod.GET)
    public HttpEntity<List<FixedDepositDetails>> getFixedDepositList() {
	.....
	return new HttpEntity<List<FixedDepositDetails>>(fixedDepositService.getFixedDeposit());
    }
    .....
}
