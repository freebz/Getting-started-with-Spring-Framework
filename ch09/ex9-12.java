// 예제 9-12: SampleAspace 클래스

package sample.spring.chapter09.bankapp.aspects;
.....
public class SampleAspect {
     .....
    public void afterReturningAdvice(JoinPoint joinPoint, int aValue) {
	logger.info("Value retruned by " + joinPoint.getSignature().getName()+ " method is " + aValue);
    }
    public void afterThrowingAdvice(JoinPoint joinPoint, Throwable exception) {
	logger.info("Exception thrown by " + joinPoint.getSignature().getName()
            + " Exception type is : " + exception);
    }
    .....
}
