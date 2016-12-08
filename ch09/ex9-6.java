// 예제 9-6: LoggingAspect 클래스

package sample.spring.chapter09.bankapp.aspects;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
@Component
public class LoggingAspect {
    @Pointcut(value = "execution(* sample.spring.chapter09.bankapp.service.*Service.*(..))")
    private void invokeServiceMethods() { }

    @Before(value = "invokeServiceMethods()")
    public void log(JoinPoint joinPoint) {
	logger.info("Entering " + joinPoint.getTarget().getClass().getSimpleName() + "'s "
            +joinPoint.getSignature().getName());
	.....
    }
}
