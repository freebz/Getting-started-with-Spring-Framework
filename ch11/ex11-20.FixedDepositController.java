// 예제 11-20: FixedDepositController - WebDataBinder의 setDisallowedFields 메서드

package sample.spring.chapter11.web;
.....
public class FixedDepositController {
    .....
    @RequestMapping(params = "fdAction=edit", method = RequestMethod.POST)
    public String editFixedDeposit(
        @ModelAttribute("editableFixedDepositDetails") FixedDepositDetails fixedDepositDetails) {
	.....
    }

    @InitBinder(value = "editableFixedDepositDetails")
    public void initBinder_Edit(WebDataBinder webDataBinder) {
	webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(
            new SimpleDateFormat("MM-dd-yyyy"), false));
	webDataBinder.setDisallowedFields("id");
    }
}
