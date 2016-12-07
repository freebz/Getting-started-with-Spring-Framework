// 예제 8-29: @Cacheable 어노테이션

package sample.spring.chapter08.bankapp.service;

import org.springframework.cache.annotation.Cacheable;
.....
@Service(value = "FixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {
    .....
    @Cacheable(value = { "FixedDepositList" })
    public List<FixedDepositDetails> findFixedDepositsByBankAccount(int bankAccountId) {
	logger.info("findFixedDepositsByBankAccount method invoked");
	return myFixedDepositDao.findFixedDepositsByBankAccount(bankAccountId);
    }
}
