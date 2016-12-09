// 예제 11-11: @SessionAttributes 어노테이션 사용

package sample.spring.chapter11.web;

import org.springframework.web.bind.annotation.SessionAttributes;
.....
@SessionAttributes(value = { "newFixedDepositDetails", "editableFixedDepositDetails" })
public class FixedDepositController {
    .....
    @ModelAttribute(value = "newFixedDepositDetails")
    public FixedDepositDetails getNewFixedDepositDetails() {
	FixedDepositDetails fixedDepositDetails = new FixedDepositDetails();
	fixedDepositDetails.setEmail("You must enter a valid email");
	return fixedDepositDetails;
    }
    .....
    @RequestMapping(params = "fdAction=create", method = RequestMethod.POST)
    public String openFixedDeposit(
        @ModelAttribute(value = "newFixedDepositDetails") FixedDepositDetails fixedDepositDetails,
	.....) { ..... }    

    @RequestMappint(params = "fdAction=view", method = RequestMethod.GET)
    public ModelAndView viewFixedDepositDetails(
           @RequestParam(value = "fixedDepositId") int fixedDepositId) {
	FixedDepositDetails fixedDepositDetails =
	    fixedDepositService.getFixedDeposit(fixedDepositId);
	Map<String, Object> modelMap = new HashMap<String, Object>();
	modelMap.put("editableFixedDepositDetails", fixedDepositDetails);
	.....
	return new ModelAndView("editFixedDepositForm", modelMap);
    }
}
