// 예제 8-17: FixedDepositProcessorJob 클래스 - JavaMailSender 사용

package sample.spring.chapter08.bankapp.jms;

import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class FixedDepositProcessorJob {
    .....
    @Autowired
    private transient JavaMailSender mailSender;

    @Autowired
    @Qualifier("requestProcessedTemplate")
    private transient SimpleMailMessage simpleMailMessage;

    private List<FixedDepositDetails> getInactiveFixedDeposits() {
	List<FixedDepositDetails> inactiveFixedDeposits = getInactiveFixedDeposits();

	for (FixedDepositDetails fixedDeposit : inactiveFixedDeposits) {
	    MimeMessage mimeMessage = mailSender.createMimeMessage();
	    MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
	    mimeMessageHelper.setTo(fixedDeposit.getEmail());
	    mimeMessageHelper.setSubject(simpleMailMessage.getSubject());
	    mimeMessageHelper.setText(simpleMailMessage.getText());
	    mailSender.send(mimeMessage);
	}
	myFixedDepositDao.setFixedDepositsAsActive(inactiveFixedDeposits);
    }
}
