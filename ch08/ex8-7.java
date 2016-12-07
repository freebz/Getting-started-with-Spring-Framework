// 예제 8-7: TransactionTemplate을 사용한 프로그래밍 방식의 JMS 트랜잭션 관리

package sample.spring.chapter08.bankapp.service;

import javax.jms.*;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

@Service(value = "FixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private TransactionTemplate transactionTemplate;
    .....
    public int createFixedDeposit(final FixedDepositDetails fixedDepositDetails) throws Exception {
	transactionTemplate.execute(new TransactionCallbackWithoutResult() {
	    protected void doInTransactionWithoutResult(TransactionStatus status) {
		jmsTemplate.send("emailQueueDestination", new MessageCreator() { ..... });
		jmsTemplate.send(new MessageCreator() { ..... });
	    }
	});
    }
    .....
}
