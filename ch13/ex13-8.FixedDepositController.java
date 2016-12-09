// 예제 13-8: FixedDepositController - DeferredResult를 반환하는, @RequestMapping 어노테이션이 지정된 메서드

package sample.spring.chapter13.web;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.springframework.web.context.request.async.DeferredResult;
.....
@Controller
@RequestMapping(value = "/fixedDeposits")
public class FixedDepositController {
    private static final String LIST_METHOD = "getFixedDepositList";
    private static final String GET_FD_METHOD = "getFixedDeposit";
    .....
    private final Queue<ResultContext> deferredResultQueue =
	new ConcurrentLinkedQueue<ResultContext>();
    .....
    @RequestMapping( method = RequestMethod.GET)
    public DeferredResult<ResponseEntity<List<FixedDepositDetails>>> getFixedDepositList() {
	DeferredResult<ResponseEntity<List<FixedDepositDetails>>> dr =
	    new DeferredResult<ResponseEntity<List<FixedDepositDetails>>>();

	ResultContext<ResponseEntity<List<FixedDepositDetails>>> resultContext =
	    new ResultContext<ResponseEntity<List<FixedDepositDetails>>>();
	resultContext.setDeferredResult(dr);
	resultContext.setMethodToInvoke(LIST_METHOD);
	resultContext.setArgs(new HashMap<String, Object>());

	deferredResultQueue.add(resultContext);
	return dr;
    }
    .....
}
