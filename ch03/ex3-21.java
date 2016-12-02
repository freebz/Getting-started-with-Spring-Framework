// 예제 3-21: ServiceTemplate 클래스

package sample.spring.chapter03.bankapp.base;

import java.beans.ConstructorProperties;

public class ServiceTemplate {
    .....
    @ConstructorProperties({"jmsMessageSender","emailMessageSender","webServiceInvoker"})
    public ServiceTemplate(JmsMessageSender jmsMessageSender,
        EmailMessageSender emailMessageSender,
        WebServiceInvoker webServiceInvoker) { ..... }
}
