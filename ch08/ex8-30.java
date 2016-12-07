// 예제 8-30: @CacheEvict 어노테이션

package sample.spring.chapter08.bankapp.service;

import org.springframework.cache.annotation.CacheEvict;
.....
@Service(value = "FixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {
    .....
    @Transactional("jmsTxManager")
    @CacheEvict(value = { "FixedDepositList" }, allEntries=true, beforeInvocation = true)
    public void createFixedDeposit(final FixedDepositDetails fixedDepositDetails) throws Exception { ..... }
    .....
}
