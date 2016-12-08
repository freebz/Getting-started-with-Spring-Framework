// 예제 10-12: @RequestMapping의 params 특성 사용

package sample.spring.chapter10.web;

import org.springframework.web.bind.annotation.RequestMethod;
.....
@Controller
@RequestMapping(value="/fixedDeposit")
public class FixedDepositController {
    .....
    @RequestMapping(params = "/fdAction=createFDForm", method = RequestMethod.POST)
    public MedelAndView showOpenFixedDepositForm() { ..... }
    .....
}
