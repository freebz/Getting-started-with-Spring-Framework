// 예제 11-6: 동일한 메서드에 @ModelAttribute 및 @RequestMapping 어노테이션 지정

package sample.spring.chapter11.web;
.....
@Controller
@RequestMapping(value = "/fixedDeposit")
.....
public class FixedDepositController {
    private static Logger logger = Logger.getLogger(FixedDepositController.class);

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ModelAttribute(value = "fdList")
    public List<FixedDepositDetails> listFixedDeposits() {
	logger.info("listFixedDeposits() method:Getting list of fixed deposits");
	return fixedDepositService.getFixedDeposits();
    }
    .....
}
