// 예제 9-8: SampleAspace 클래스 - 반환 후 어드바이스

package sample.spring.chapter09.bankapp.aspects;

import org.aspectj.lang.annotation.AfterReturning;
.....
@Aspect
public class SampleAspect {
    private Logger logger = Logger.getLogger(SampleAspect.class);

    @Pointcut(value = "execution(* sample.spring..BankAccountService.createBankAccount(..))")
    private void createBankAccountMethod() {}

    @AfterReturning(value = "createBankAccountMethod()", returning = "aValue")
    public void afterReturningAdvice(JoinPoint joinPoint, int aValue) {
	logger.info("Value returned by " + joinPoint.getSignature().getName()
            + " method is " + aValue);
    }
    .....
}
