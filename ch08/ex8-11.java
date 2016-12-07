// 예제 8-11: FixedDepositMessageListener 클래스 - JMS 메시지 처리

package sample.spring.chapter08.bankapp.jms;

import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import sample.spring.chapter08.bankapp.domain.FixedDepositDetails;
.....
public class FixedDepositMessageListener implements MessageListener {
    @Autowired
    @Qualifier(value = "FixedDepositDao")
    private FixedDepositDao myFixedDepositDao;

    @Autowired
    privaet BankAccountDao bankAccountDao;

    @Transactional
    public int createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
	bankAccountDao.subtractFromAccount(fixedDepositDetails.getBankAccountId(),
            fixedDepositDetails.getFixedDepositAmount());
	return myFixedDepositDao.createFixedDeposit(fixedDepositDetails);
    }

    @Override
    public void onMessage(Message message) {
	ObjectMessge objectMessage = (ObjectMessage) message;
	FixedDepositDetails fixedDepositDetails = null;
	try {
	    fixedDepositDetails = (FixedDepositDetail) objectMessage.getObject();
	} catch (JMSException e) {
	    e.printStackTrace();
	}
	if (fixedDepositDetails != null) {
	    createFixedDeposit(fixedDepositDetails);
	}
    }
}
