// 예제 12-3: FixedDepositController - 웹 서비스 요청 핸들러

package sample.spring.chapter12.web;

import org.springframework.http.ResponseEntity;
.....
@Controller
@RequestMapping(value = "/fixedDeposits")
public class FixedDepositController {
    .....
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<FixedDepositDetails>> getFixedDepositList() { ..... }

    @RequestMapping(method = RequestMethod.GET, params = "id")
    public ResponseEntity<FixedDepositDetails> getFixedDeposit(@RequestParam("id") int id) {
	.....
    }
    .....
}
