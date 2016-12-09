// 예제 13-7: FixedDepositController - Callable을 반환하는, @RequestMapping 어노테이션이 지정된 메서드

package sample.spring.chapter13.web;

import java.util.concurrent.Callable;
.....
public class FixedDepositController {
    .....
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Callable<ModelAndView> listFixedDeposits() {
	return new Callable<ModelAndView>() {

	    @Override
	    public ModelAndView call() throws Exception {
		Thread.sleep(5000);
		Map<String, List<FixedDepositDetails>> modelData =
		    new HashMap<String, List<FixedDepositDetails>>();
		modelData.put("fdList", fixedDepositService.getFixedDeposits());
		return new ModelAndView("fixedDepositList", modelData);
	    }
	};
    }
    .....
}
