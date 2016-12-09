// 예제 13-12: FixedDepositController의 processResults 메서드

package sample.spring.chapter13.web;

@Controller
@RequestMapping(value = "/fixedDeposits")
public class FixedDepositController {
    private static final String OPEN_FD_METHOD = "openFixedDeposit";
    .....
    private final Queue<ResultContext> deferredResultQueue =
	new ConcurrentLinkedQueue<ResultContext>();

    @Autowired
    private FixedDepositService fixedDepositService;
    .....
    @ExceptionHandler(ValidationException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public String handleException(Exception ex) {
	logger.info("handling ValidationException " + ex.getMessage());
	return ex.getMessage();
    }

    @Scheduled(fixedRate = 10000)
    public void processResults() {
	for (ResultContext resultContext : deferredResultQueue) {

	    if (resultContext.getMethodToInvoke() == OPEN_FD_METHOD) {
		FixedDepositDetails fixedDepositDetails = (FixedDepositDetails) resultContext
		    .getArgs().get("fixedDepositDetails");
		BindingResult bindingResult = (BindingResult) resultContext.getArgs().
		    get("bindingResult");

		new FixedDepositDetailsValidator().validate(fixedDepositDetails, bindingResult);

		if (bindingResult.hasErrors()) {
		    logger.info("openFixedDeposit() method: Validation errors occurred");
		    resultContext.getDeferredResult().setErrorResult(new ValidationException(
                        "Validation errors occurred"));
		} else {
		    fixedDepositService.saveFixedDeposit(fixedDepositDetails);
		    resultContext.getDeferredResult().setResult(new ResponseEntity<FixedDepositDetails>(
                        fixedDepositDetails, HttpStatus.CREATED));
		}
	    }
	    .....
	}
    }
}
