// 예제 11-14: FixedDepositController 클래스 - 자동 데이터 바인딩 예제

package sample.spring.chapter11.web;

@Controller
.....
public class FixedDepositController {
    .....
    @RequestMapping(params = "fdAction=create", method = RequestMethod.POST)
    public String openFixedDeposit(
        @ModelAttribute(value = "nexFixedDepositDetails") FixedDepositDetails fixedDepositDetails,
	    BindingResult bindingResult, SessionStatus sessionStatus) {
	....
    }
    .....
}
