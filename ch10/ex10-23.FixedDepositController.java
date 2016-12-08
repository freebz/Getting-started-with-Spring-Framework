// 예제 10-23: FixedDepositController 클래스 - HttpServletRequest 인자 전달

package sample.spring.chapter10.web;

import javax.servlet.http.HttpServletRequest;
.....
public class FixedDepositController {
    .....
    @RequestMapping(params = "fdAction=view", method = RequestMethod.GET)
    public ModelAndView viewFixedDepositDetails(HttpServletRequest request) {
	FixedDepositDetails fixedDepositDetails = fixedDepositService
	    .getFixedDeposit(Integer.parseInt(request.getParameter("fixedDepositId")));
	.....
    }
    .....
}
