// 예제 8-18: MimeMessagePreparator 사용

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import org.springframework.mail.javamail.MimeMessagePreparator;

public class FixedDepositProcessorJob {
    .....
    public void sendEmail_() throws AddressException, MessagingException {	
	List<FixedDepositDetails> inactiveFixedDeposits = getInactiveFixedDeposits();
	for (final FixedDepositDetails fixedDeposit : inactiveFixedDeposits) {
	    mailSender.send(new MimeMessagePreparator() {
		@Override
		public void prepare(MimeMessage mimeMessage) throws Exception {
		    mimeMessage.setRecipient(Message.RecipientType.TO,
		        new InternetAddress(fixedDeposit.getEmail()));
		    mimeMessage.setSubject(simpleMailMessage.getSubject());
		    mimeMessage.setText(simpleMailMessage.getText());
		}
	    });
	}
	myFixedDepositDao.setFixedDepositsAsActive(inactiveFixedDeposits);
    }
}
