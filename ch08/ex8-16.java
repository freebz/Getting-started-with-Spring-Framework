// 예제 8-16: EmailMessageListener 클래스 - MailSender를 사용한 이메일 전송

package sample.spring.chapter08.bankapp.jms;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
.....
public class EmailMessageListener implements MessageLisstener {
    @Autowired
    private transient MailSender mailSender;

    @Autowired
    @Qualifier("requestReceivedTemplate")
    private transient SimpleMailMessage simpleMailMessage;

    public void sendEmail() {
	mailSender.send(simpleMailMessage);
    }

    public void onMessage(Message message) {
	TextMessage textMessage = (TextMessage) message;
	try {
	    simpleMailMessage.setTo(textMessage.getText());
	} catch (Exception e) {
	    e.printStackTrace();
	}
	sendEmail();
    }
}
