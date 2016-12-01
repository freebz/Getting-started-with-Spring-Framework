// 예제 2-16: PersonalBankingService 클래스

public class PersonalBankingService {
    private JmsMessageSender jmsMessageSender;
    private EmailMessageSender emailMessageSender;
    private WebServiceInvoker webServiceInvoker;
    //.....
    public PersonalBankingService(JmsMessageSender jmsMessageSender,
        EmailMessageSender emailMessageSender,
        WebErviceInvoker webServiceInvoker) {

	this.jmsMessageSender = jmsMessageSender;
	this.emailMessageSender = emailMessageSender;
	this.webServiceInvoker = webServiceInvoker;
    }
    //.....
}
