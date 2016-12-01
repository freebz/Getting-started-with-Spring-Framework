// 예제 2-9: PersonalBankingService 클래스

public class PersonalBankingService {
    private JmsMessageSender jmsMessageSender;
    private EmailMessageSender emailMessageSender;
    private WebServiceInvoker webServiceInvoker;
    //.....
    public void setJmsMessageSender(JmsMessageSender jmsMessageSender) {
	this.jmsMessageSender = jmsMessageSender;
    }

    public void setEmailMessageSender(EmailMessageSender emailMessageSender) {
	this.emailMessageSender = emailMessageSender;
    }

    public void setWebServiceInvoker(WebServiceInvoker webServiceInvoker) {
	this.webServiceInvoker = webServiceInvoker;
    }
    //.....
}
