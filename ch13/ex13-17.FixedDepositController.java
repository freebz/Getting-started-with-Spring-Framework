// 예제 13-17: FixedDepositController의 viewFixedDepositDetails 메서드

package sample.spring.chapter13.web;
.....
public class FixedDepositController {
    .....
    @RequestMapping(params = "fdAction=view", method = RequestMethod.GET)
    public ModelAndView viewFixedDepositDetails(
        @RequestParam(value = "fixedDepositId") FixedDepositDetails fixedDepositDetails) {
	.....
    }
}
