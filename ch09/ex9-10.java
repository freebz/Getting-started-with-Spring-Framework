// 예제 9-10: SampleAspace 클래스 - 사후 어드바이스

package sample.spring.chapter09.bankapp.aspects;

import org.aspectj.lang.annotation.After;
.....
@Aspect
public class SampleAspect {
    private Logger logger = Logger.getLogger(SampleAspect.class);

    @Pointcut(value = "execution(* sample.spring..BankAccountService.createBankAccount(..))")
    private void createBankAccountMethod() {}

    @Pointcut(value =  "execution(* sample.spring..FixedDepositService.*(..))")
    private void execeptionMethods() {}
    .....
    @After(value = "exceptionMethods() || createBankAccountMethod()")
    public void afterAdvice(JoinPoint joinPoint) {
	logger.info("Exception thrown by " + joinPoint.getSignature().getName());
    }
}
