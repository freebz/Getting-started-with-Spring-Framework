// 예제 10-24: FixedDepositController 클래스 - ModelAndView 반환 형식 예

package sample.spring.chapter10.web;

import org.springframework.ui.ModelMap;
.....
public class FixedDepositController {
    .....
    @RequestMapping(params = "fdAction=view", method = RequestMethod.POST)
    public ModelAndView showOpenFixedDepositForm() {
	FixedDepositDetails fixedDepositDetails = new FixedDepositDetails();
	fixedDepositDetails.setEmail("You must enter a valid email");
	ModelMap modelData = new ModelMap();
	modelData.addAttribute(fixedDepositDetails);
	return new ModelAndView("createFixedDepositForm", modelData);
    }
    .....
}
