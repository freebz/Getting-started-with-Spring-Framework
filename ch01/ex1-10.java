// 예제 1-10: JMS 메시지를 전송하는 FixedDepositService

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class FixedDepositService {
    @Autowired
    private transient JmsTemplate jmsTemplate;
    //.....
    public boolean submitRequest(Request request) {
	jmsTemplate.convertAndSend(request);
    }
}
