// 예제 3-58: FixedDepositServiceImpl 클래스

package sample.spring.chapter03.bankapp.service;

import sample.spring.chapter03.bankapp.event.EventSender;

public class FixedDepositServiceImpl implements FixedDepositService {
    .....
    private EventSender eventSender;

    public void setEventSender(EventSender eventSender) {
	this.eventSender = eventSender;
    }
    .....
    public void createFixedDeposit(FixedDepositDetails fixedDepositDetails) {
	.....
	eventSender.sendEvent(event);
    }
}
