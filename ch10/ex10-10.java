// 예제 10-10: @RequestMapping의 method 특성 사용

package sample.spring.chapter10.web;

import org.springframework.web.bind.annotation.RequestMethod;
.....
@Controller
@RequestMapping(value="/fixedDeposit")
public class SomeController {
    .....
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public MedelAndView listFixedDeposits() { ..... }
    .....
}
