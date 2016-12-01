// 예제 1-6: @Transactional 어노테이션 사용

import org.springframework.transaction.annotation.Transactional;

public class FixedDepositService {
    public FixedDepositDetails getFixedDepositDetails( ..... ) { ..... }

    @Transactional
    public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) { ..... }
}
