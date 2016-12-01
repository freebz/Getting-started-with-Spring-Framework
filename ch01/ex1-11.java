// 예제 1-11: 정기 예금 내역을 캐시하는 FixedDepositService

import org.springframework.cache.annotation.Cacheable;

public class FixedDepositService {

    @Cacheable("FixedDeposits")
    public FixedDepositDetails getFixedDepositDetails( ..... ) { ..... }

    public boolean createFixedDeposit(FixedDepositDetails fixedDepositDetails) { ..... }
}
