// 예제 7-17: FixedDepositServiceImpl 클래스 - @Transactional 어노테이션 사용

package sample.spring.chapter07.bankapp.service;

import org.springframework.transaction.annotation.Transactional;
.....
@Service(value = "FixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {
    .....
    @Transactional
    public int createFixedDeposit(final FixedDepositDetails fixedDepositDetails) throws Exception {
	bankAccountDao.subtractFromAccount(fixedDepositDetails.getBankAccountId(),
            fixedDepositDetails.getFixedDepositAmount());
	return myFixedDepositDao.createFixedDeposit(fixedDepositDetails);
    }
    .....
}
