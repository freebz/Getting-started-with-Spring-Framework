// 예제 10-34: FixedDepositController의 openFixedDeposit 메서드

package sample.spring.chapter10.web;
.....
import org.apache.commons.lang3.math.NumberUtils;

@RequestMapping(value = "/fixedDeposit")
public class FixedDepositController {
     .....
    @RequestMapping(params = "fdAction=create", method = RequestMethod.POST)
    public ModelAndView openFixedDeposit(@RequestParam Map<String, String> params) {
	String depositAmount = params.get("depositAmount");
	.....
	Map<String, Object> modelData = new HashMap<String, Object>();

	if (!NumberUtils.isNumber(depositAmount)) {
	    modelData.put("error.depositAmount", "enter a valid number");
	} else if (NumberUtils.toInt(depositAmount) < 1000) {
	    modelData.put("error.depositAmount", "must be greater than or equal to 1000");
	}
	.....
	FixedDepositDetails fixedDepositDetails = new FixedDepositDetails();
	fixedDepositDetails.setDepositAmount(depositAmount);
	.....
	if (modelData.size() > 0) { // -- 유효성 오류가 발생한 경우
	    model.put("fixedDepositDetails", fixedDepositDetails);
	    return new ModelAndView("createFixedDepositForm", modelData);
	} else {
	    fixedDepositService.saveFixedDeposit(fixedDepositDetails);
	    return new ModelAndView("redirect:/fixedDeposit/list");
	}
    }
    .....
}
