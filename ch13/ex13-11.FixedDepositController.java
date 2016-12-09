// 예제 13-11: FixedDepositController의 openFixedDeposit 메서드

package sample.spring.chapter13.web;

@Controller
@RequestMapping(value = "/fixedDeposits")
public class FixedDepositController {
    private static final String OPEN_FD_METHOD = "openFixedDeposit";
    .....
    private final Queue<ResultContext> deferredResultQueue =
	new ConcurrentLinkedQueue<ResultContext>();

    @RequestMapping( method = RequestMethod.POST)
    public DeferredResult<ResponseEntity<FixedDepositDetails>> openFixedDeposit(
            @RequestBody FixedDepositDetails fixedDepositDetails,BindingResult bindingResult) {

	DeferredResult<ResponseEntity<FixedDepositDetails>> dr =
	    new DeferredResult<ResponseEntity<FixedDepositDetails>>();

	ResultContext<ResponseEntity<FixedDepositDetails>> resultContext =
	    new ResultContext<ResponseEntity<FixedDepositDetails>>();

	resultContext.setDeferred(dr);
	resultContext.setMethodToInvoke(OPEN_FD_METHOD);

	Map<String, Object> args = new HashMap<String, Object>();
	args.put("fixedDepositDetails", fixedDepositDetais);
	args.put("bindingResult", bindingResult);
	resultContext.setArgs(args);

	deferredResultQueue.add(resultContext);
	return dr;
    }
    .....
}
