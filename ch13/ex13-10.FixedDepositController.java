// 예제 13-10: processResults 메서드 - 계산을 수행하고 결과를 DeferredResult 객체에 저장

package sample.spring.chapter13.web;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.context.request.async.DeferredResult;

@Controller
@RequestMapping(value = "/fixedDeposits")
public class FixedDepositController {
    private static final String LIST_METHOD = "getFixedDepositList";
    .....
    private final Queue<ResultContext> deferredResultQueue =
	new ConcurrentLinkedQueue<ResultContext>();
    @Autowired
    private FixedDepositService fixedDepositService;
    .....
    @Scheduled(fixedRate = 10000)
    public void processResults() {
	for (ResultContext resultContext : deferredResultQueue) {
	    if (resultContext.getMethodToInvoke() == LIST_METHOD) {
		resultContext.getDeferredResult().setResult(
                    new ResponseEntity<List<FixedDepositDetails>>(
                          fixedDepositService.getFixedDeposits(), HttpStatus.OK));
	    }
	    .....
	    deferredResultQueue.remove(resultContext);
	}
    }
}
