// 예제 11-19: FixedDepositController

package sample.spring.chapter11.web;
.....
@SessionAttributes(value = { "newFixedDepositDetails", "editableFixedDepositDetails" })
public class FixedDepositController {
    .....
    @RequestMapping(params = "fdAction=view", method = RequestMethod.GET)
    public ModelAndView viewFixedDepositDetails(
            @RequestParam(value = "fixedDepositId") int fixedDepositId) {
	FixedDepositDetails fixedDepositDetails = fixedDepositService
	    .getFixedDeposit(fixedDepositId);
	modelMap.put("editableFixedDepositDetails", fixedDepositDetails);
	.....
	return new ModelAndView("editFixedDepositForm", modelMap);
    }

    @RequestMapping(params = "fdAction=edit", method = RequestMethod.POST)
    public String editFixedDeposit(
        @ModelAttribute("editableFixedDepositDetails") FixedDepositDetails fixedDepositDetails) {
	.....
    }
}
