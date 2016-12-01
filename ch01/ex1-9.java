// 예제 1-9: 스프링의 JMX 지원을 사용하는 FixedDepositService 클래스

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName = "fixed_deposit_service:name=FixedDepositService")
public class FixedDepositService {
    private boolean active;

    public FixedDepositDetails getFixedDepositDetails( ..... ){
	if (active) { ..... }
    }
    public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
	if (active) { ..... }
    }

    @ManagedOperation
    public void activateService() {
	active = true;
    }

    @ManagedOperation
    public void deactivateService() {
	active = false;
    }
}
