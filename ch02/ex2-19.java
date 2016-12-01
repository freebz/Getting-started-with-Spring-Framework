// 예제 2-19: PersonalBankingService 클래스

public class PersonalBankingService {
    private JmsMessageSender jmsMessageSender;
    private EmailMessageSender emailMessageSender;
    private WebServiceInvoker webServiceInvoker;
    //.....
    public PersonalBankingService(JmsMessageSender jmsMessageSender,
        EmailMessageSender emailMessageSender) {
	this.jmsMessageSender = jmsMessageSender;
	this.emailMessageSender = emailMessageSender;
    }

    public void setWebServiceInvoker(WebServiceInvoker webServiceInvoker) {
	this.webServiceInvoker = webServiceInvoker;
    }
    //.....
}
