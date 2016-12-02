// 예제 3-9: ServiceTemplate 클래스

package sample.spring.chapter03.bankapp.base;

public class ServiceTemplate {
    .....
    
    public ServiceTemplate(JmsMessageSender jmsMessageSender,
	EmailMessageSender emailMessageSender,
	WebServiceInvoker webServiceInvoker) {
	.....
    }
}
