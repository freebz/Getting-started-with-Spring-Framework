// 예제 7-13: TransactionTemplate을 사용하는 FixedDepositServiceImpl 클래스

package sample.spring.chapter07.bankapp.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
.....
@Service(value = "FixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {

    @Autowired
    private TransactionTemplate transactionTemplate;
    .....
    @Override
    public int createFixedDeposit(final FixedDepositDetails fixedDepositDetails) throws Exception {
	transactionTemplate.execute(new TransactionCallback<FixedDepositDetails>() {
	    public FixedDepositDetails doInTransaction(TransactionStatus status) {	    
		try {
		    myFixedDepositDao.createFixedDeposit(fixedDepositDetails);
		    bankAccountDao.subtractFromAccount(
                        fixedDepositDetails.getBankAccountId(),
			fixedDepositDetails.getFixedDepositAmount()
                    );
		} catch (Exception e) { status.setRollbackOnly(); }
		return fixedDepositDetails;
	    }
	});    
	return fixedDepositDetails.getFixedDepositId();
    }
    .....
}
