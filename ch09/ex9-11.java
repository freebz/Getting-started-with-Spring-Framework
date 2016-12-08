// 예제 9-11: SampleAspace 클래스 - 전후 어드바이스

package sample.spring.chapter09.bankapp.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.util.StopWatch;
.....
@Aspect
public class SampleAspect {
     .....
    @Around(value = "execution(* sample.spring..*Service.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) {
	Object obj = null;
	StopWatch watch = new StopWatch();
	watch.start();
	try {
	    obj = pjp.proceed();
	} catch (Throwable throwable) {
	    // -- 원하는 작업을 수행한다.
	}
	watch.stop();
	logger.info(watch.prettyPrint());
	return obj;
    }
}
