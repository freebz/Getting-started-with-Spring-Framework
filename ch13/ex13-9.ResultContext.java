// 예제 13-9: DeferredResult 및 다른 정보를 저장하는 ResultContext 클래스

package sample.spring.chapter13.web;

import java.util.Map;
import org.springframework.web.context.request.async.DeferredResult;

public class ResultContext<T> {
    private String methodToInvoke;
    private DeferredResult<T> deferredResult;
    private Map<String, Object> args;

    public void setDeferredRequest(DeferredResult<T> deferredResult) {
	this.deferredResult = deferredResult;
    }
    .....
}
