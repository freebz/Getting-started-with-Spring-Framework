// 예제 8-25: @Async 어노테이션 사용

import java.util.concurrent.Future;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

@Compoenet
public class Sample {
    @Async
    public void doA() { ..... }

    @Async(value="someExecutor")
    public void doB(String str) { ..... }

    @Async
    public Future<String> doC() {
	return new AsyncResult<String>("Hello");
    }
}
