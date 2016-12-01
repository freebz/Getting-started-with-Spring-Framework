// 예제 1-7: 보안이 적용된 createFixedDeposit 메서드

import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.access.annotation.Secured;

public class FixedDepositService {
    public FixedDepositDetails getFixedDepositDetails( ..... ) { ..... }

    @Transactional
    @Secured({ "SAVINGS_ACCOUNT_CUSTOMER", "APPLICATION_ADMIN" })
    public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) { ..... }
}
