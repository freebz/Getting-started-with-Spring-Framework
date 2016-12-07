// 예제 8-5: FixedDepositServiceImpl 클래스 - JmsTemplate을 사용한 JMS 메시지 전송

package sample.spring.chapter08.bankapp.service;

import javax.jms.*;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

@Service(value = "FixedDepositService")
public class FixedDepositServiceImpl implements FixedDepositService {
    @Autowired
    private JmsTemplate jmsTemplate;
    .....
    @Override
    @Transactional("jmsTxManager")
    public int createFixedDeposit(final FixedDepositDetails fixedDepositDetails) throws Exception {
	jmsTemplate.send("emailQueueDestination", new MessageCreator() {
	    public Message createMessage(Session session) throws JMSException {
		TextMessage textMessage = session.createTextMessage();
		textMessage.setText(fixedDepositDetails.getEmail());
		return textMessage;
	    }
	});
	// --이 JMS 메시지는 JmsTemplate에 구성된 기본 대상으로 전송된다.
	jmsTemplate.send(new MessageCreator() {
	    public Message createMessage(Session session) throws JMSException {
		ObjectMessage objectMessage = session.createObjectMessage();
		objectMessage.setObject(fixedDepositDetails);
		return objectMessage;
	    }
	});
    }
    .....
}
