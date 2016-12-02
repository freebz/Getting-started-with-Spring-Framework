// 예제 3-59: FixedDepositServiceImpl 클래스가 EventSenderFactoryBean 자체에 의존하는 경우

package sample.spring.chapter03.bankapp.service;

import sample.spring.chapter03.bankapp.event.EventSenderFactoryBean;
import sample.spring.chapter03.bankapp.event.EventSender;

public class FixedDepositServiceImpl implements FixedDepositService {
    .....
    private EventSenderFactoryBean eventSenderFactoryBean;

    public void setEventSenderFactoryBean(EventSenderFactoryBean eventSenderFactoryBean) {
	this.eventSenderFactoryBean = eventSenderFactoryBean;
    }
    .....
    public void createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
	.....
	EventSender eventSender = eventSenderFactoryBean.getObject();
	eventSender.sendEvent(event);
    }
}
