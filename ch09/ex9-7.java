// 예제 9-7: LoggingAspect 클래스 - 대상 메서드의 인자를 어드바이스로 전달

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
@Component
public class LoggingAspect {
    .....
    @Pointcut(value =
        "execution(* sample.spring.chapter09.bankapp.service.*Service.*(..)) && args(FixedDepositDetails) ")
    private void invokeServiceMethods(FixedDepositDetails fixedDepositDetails) {
    }

    @Before(value = "invokeServiceMethods(FixedDepositDetails)")
    public void log(JoinPoint joinPoint, FixedDepositDetails fixedDepositDetails) {
	.....
    }
}
