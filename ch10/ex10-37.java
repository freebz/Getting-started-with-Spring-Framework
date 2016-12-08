// 예제 10-37: @ExceptionHandler 어노테이션 사용

package sample.spring.chapter10.web;

import org.springframework.web.bind.annotation.ExceptionHandler;
.....
@Controller
@RequestMapping(value = "/fixedDeposit")
public class FixedDepositController {
    .....
    @ExceptionHandler
    public String handleException(Exception ex) {
	return "error";
    }
}
